import java.io.*;
import java.util.Scanner;
public class Non {
  public static void main(String[] args){
    File data = new File (args[0]);
    int mode = Integer.parseInt(args[1]);
    if (mode == 1) System.out.println(problemOne(data));
    if (mode == 2) System.out.println(problemTwo(data));
  }
  public static int problemOne(File data){
    try {
      //Ds1.txt
      Scanner input = new Scanner(data);
      int totalVowels = 0;
      boolean repeatLetter = false, badString = true;
      int total = 0;
      String newLine;
      while (input.hasNext()){
        newLine = input.nextLine() + ".";
        totalVowels = 0;
        repeatLetter = false;
        badString = true;
        for (int i = 0; i<newLine.length()-1; i++){
          if (newLine.charAt(i) == 'a' || newLine.charAt(i) == 'e' || newLine.charAt(i) == 'i' || newLine.charAt(i) == 'o' || newLine.charAt(i) == 'u'){
            totalVowels++;
          }
          if (newLine.charAt(i) == newLine.charAt(i+1)) repeatLetter = true;
          if (newLine.substring(i,i+2).equals("ab") ||newLine.substring(i,i+2).equals("cd") || newLine.substring(i,i+2).equals("pq") || newLine.substring(i,i+2).equals("xy")){
            badString = false;
          }
        }
        if (repeatLetter && badString && totalVowels >= 3) total++;
      }
      input.close();
      return total;
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    return -1;
  }
  public static int problemTwo(File data){
    try {
      //Ds3.txt
      Scanner input = new Scanner(data);
      boolean oneLetter = false, doubleLetters = false;
      int total = 0;
      String newLine;
      while (input.hasNext()){
        newLine = input.nextLine() + "..";
        oneLetter = false;
        doubleLetters = false;
        for (int i = 0; i<newLine.length()-2; i++){
          if (newLine.charAt(i) == newLine.charAt(i+2)) oneLetter = true;
          for (int j = i+2; j<newLine.length()-1; j++){
            if (newLine.substring(i,i+2).equals(newLine.substring(j,j+2))){
              doubleLetters = true;
            }
          }
        }
        //if (oneLetter && doubleLetters) total++;
        if (oneLetter && doubleLetters) total++;
      }
      input.close();
      return total;
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    return -1;
  }
}
