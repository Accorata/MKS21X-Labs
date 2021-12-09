public class WordSearch{
    private char[][]data;
    public WordSearch(int rows,int cols){
      data = new char[cols][];
      for (int i = 0; i<cols; i++){
        data[i] = new char[rows];
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
      for (int i = 0; i<word.length(); i++) {
        if (col+i>=data.length || (data[col+i][row] != '_' && data[col+i][row] != word.charAt(i))) {
          return false;
        }
      }
      for (int i = 0; i<word.length(); i++) {
        data[col+i][row] = word.charAt(i);
      }
      return true;
    }
    public boolean addWordVertical(String word,int col, int row){
      for (int i = 0; i<word.length(); i++) {
        if (row+i>=data[col].length || (data[col][row+i] != '_' && data[col][row+i] != word.charAt(i))) {
          return false;
        }
      }
      for (int i = 0; i<word.length(); i++) {
        data[col][row+i] = word.charAt(i);
      }
      return true;
    }
    public boolean addWordDiagonal(String word,int row, int col){
      for (int i = 0; i<word.length(); i++) {
        if (col+i>=data.length || row+i>=data[col].length || (data[col+i][row+i] != '_' && data[col+i][row+i] != word.charAt(i))) {
          return false;
        }
      }
      for (int i = 0; i<word.length(); i++) {
        data[col+i][row+i] = word.charAt(i);
      }
      return true;
    }
    public boolean addWord(String word,int row, int col, int xdir, int ydir){
      for (int i = 0; i<word.length(); i++) {
        if (col+i*xdir>=data.length || row+i*ydir>=data[col].length || (data[col+i*xdir][row+i*ydir] != '_' && data[col+i*xdir][row+i*ydir] != word.charAt(i))) {
          return false;
        }
      }
      for (int i = 0; i<word.length(); i++) {
        data[col+i][row+i] = word.charAt(i);
      }
      return true;
    }
}
