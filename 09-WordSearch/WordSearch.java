public class WordSearch{
    private char[][]data;
    public WordSearch(int rows,int cols){
      data = new char[rows][];
      for (int i = 0; i<rows; i++){
        data[i] = new char[cols];
      }
      clear();
    }
    private void clear(){
      for(int i = 0; i<data.length; i++){
        for(int j = 0; j<data[i].length; j++){
          data[i][j] = '_';
        }
      }
    }
    public String toString(){
      String grid = "";
      for(int i = 0; i<data.length; i++){
        for(int j = 0; j<data[i].length; j++){
          grid += data[i][j];
          if (j != data[i].length-1) grid += " ";
        }
        if (i != data.length-1) grid += "\n";
      }
      return grid;
    }
    public boolean addWordHorizontal(String word,int col, int row){
      char[] letters = new char [word.length()];
      for (int i = 0; i<letters.length; i++){
        letters[i] = word.charAt(i);
      }
      for (int i = 0; i<letters.length; i++) {
        if (col+i>=data[i].length || (data[row][col+i] != '_' && data[row][col+i] != letters[i])) {
          return false;
        }
      }
      for (int i = 0; i<letters.length; i++) {
        data[row][col+i] = letters[i];
      }
      return true;
    }
    public boolean addWordVertical(String word,int col, int row){
      char[] letters = new char [word.length()];
      for (int i = 0; i<letters.length; i++){
        letters[i] = word.charAt(i);
      }
      for (int i = 0; i<letters.length; i++) {
        if (row+i>=data.length || (data[row+i][col] != '_' && data[row+i][col] != letters[i])) {
          return false;
        }
      }
      for (int i = 0; i<letters.length; i++) {
        data[row+i][col] = letters[i];
      }
      return true;
    }
}
