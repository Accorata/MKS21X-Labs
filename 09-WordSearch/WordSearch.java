import java.util.*;
public class WordSearch{
    private char[][]data;
    private int seed;
    private Random randgen;
    private ArrayList<String> wordsAdded
    private ArrayList<String> words;
    public WordSearch(int rows,int cols, String fileName, int randSeed){
      seed = randSeed;
      randgen = new Random(seed);
      Scanner file = new Scanner(fileName);
      while (file.hasNext()){
        words.add(file.next());
      }
      data = new char[cols][];
      for (int i = 0; i<cols; i++){
        data[i] = new char[rows];
      }
      clear();
      addAllWords();
    }
    public WordSearch(int rows,int cols, String fileName){
      randgen = new Random();
      this.(rows, cols, fileName, randgen.nextInt());
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
    public boolean addWord(String word,int row, int col, int xdir, int ydir){
      if (xdir == 0 && ydir == 0) return false;
      for (int i = 0; i<word.length(); i++) {
        if (col+i*ydir>=data.length || row+i*xdir>=data[0].length || (data[col+i*ydir][row+i*xdir] != '_' && data[col+i*ydir][row+i*xdir] != word.charAt(i))) {
          return false;
        }
      }
      for (int i = 0; i<word.length(); i++) {
        data[col+i*ydir][row+i*xdir] = word.charAt(i);
      }
      return true;
    }
    public static void addAllWords(){
      addWord(words.get(randgen.nextInt(words.length()-1)), randgen.nextInt(data[0].length-1), randgen.nextInt(data.length-1), randgen.nextInt(2)-1, randgen.nextInt(2)-1);
    }
    /*public boolean addWordHorizontal(String word,int col, int row){
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
    }*/
}
