import java.util.*;
import java.io.*;
public class WordSearch{
    private char[][]data;
    private int seed;
    private Random randgen;
    private ArrayList<String> wordsAdded;
    private ArrayList<String> words;
    public WordSearch(int rows,int cols, String fileName, int randSeed){
      words = new ArrayList<String>();
      wordsAdded = new ArrayList<String>();
      seed = randSeed;
      randgen = new Random(seed);
      data = new char[cols][];
      for (int i = 0; i<cols; i++){
        data[i] = new char[rows];
      }
      clear();
      addAllWords(fileName);
    }
    public WordSearch(int rows,int cols, String fileName){
      words = new ArrayList<String>();
      wordsAdded = new ArrayList<String>();
      randgen = new Random ();
      seed = randgen.nextInt();
      randgen = new Random(seed);
      data = new char[cols][];
      for (int i = 0; i<cols; i++){
        data[i] = new char[rows];
      }
      clear();
      addAllWords(fileName);
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
    private boolean addWord(String word,int row, int col, int xdir, int ydir){
      if (xdir == 0 && ydir == 0) return false;
      for (int i = 0; i<word.length(); i++) {
        try {
          if (data[col+i*ydir][row+i*xdir] != '_' && data[col+i*ydir][row+i*xdir] != word.charAt(i)) {
            return false;
          }
        } catch (ArrayIndexOutOfBoundsException e){
          return false;
        }
      }
      for (int i = 0; i<word.length(); i++) {
        data[col+i*ydir][row+i*xdir] = word.charAt(i);
      }
      return true;
    }
    public void addAllWords(String fileName){
      try {
        File file = new File (fileName);
        Scanner input = new Scanner (file);
        while (input.hasNext()){
          String next = input.nextLine();
          if (next != null){
            words.add(next);
          }
        }
        while (words.size() > 0){
          int wordPos = randgen.nextInt(words.size());
          String word = words.get(wordPos);
          for (int i = 0; i<100; i++){
            if (addWord(word, randgen.nextInt(data[0].length), randgen.nextInt(data.length), randgen.nextInt(3)-1, randgen.nextInt(3)-1)){
              wordsAdded.add(word);
              i = 100;
            }
          }
          words.remove(wordPos);
        }
      } catch (FileNotFoundException e){
        e.printStackTrace();
      }
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
