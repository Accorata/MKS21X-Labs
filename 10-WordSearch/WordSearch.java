import java.util.*;
import java.io.*;
public class WordSearch{
    private char[][]data;
    private int seed;
    private Random randgen;
    private ArrayList<String> wordsAdded;
    private ArrayList<String> words;
    public static void main(String[] args){
      if (args[4] == null) {
        WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2], Integer.parseInt(args[3]));
      } else {
        WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]));
      }
    }
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
      addLetters();
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
      addLetters();
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
    private void addAllWords(String fileName){
      try {
        File file = new File (fileName);
        Scanner input = new Scanner (file);
        while (input.hasNext()){
          String next = input.nextLine();
          if (next != ""){
            words.add(next.toUpperCase());
          }
        }
        input.close();
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
        System.exit(1);
      }
    }
    private void addLetters(){
      for(int i = 0; i<data.length; i++){
        for(int j = 0; j<data[i].length; j++){
          if (data[i][j] == '_'){
            data[i][j] = 'O';
          }
        }
      }
    }
}
