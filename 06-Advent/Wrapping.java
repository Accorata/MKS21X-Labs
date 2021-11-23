import java.io.*;
import java.util.Scanner;
public class Wrapping {
  public static void main(String[] args){
    File data = new File (args[0]);
    int mode = Integer.parseInt(args[1]);
    if (mode == 1) System.out.println(problemOne(data));
    //if (mode == 2) System.out.println(problemTwo(data));
  }
  public static int problemOne(File data){
    try {
      //W.txt
      Scanner input = new Scanner(data);
      String[] newLine = new String[3];
      int[] points = new int[3];
      int total = 0;
      int min = 0;
      while (input.hasNext()){
        newLine = input.nextLine().split("x");
        for (int i = 0; i<3; i++){
          points[i] = Integer.parseInt(newLine[i]);
        }
        min = points[0] * points[1];
        if (points[1] * points[2] < min) min = points[1] * points[2];
        if (points[0] * points[2] < min) min = points[0] * points[2];
        total += 2 * points[0] * points[1] + 2 * points[1] * points[2] + 2 * points[0] * points[2] + min;
      }
      input.close();
      return total;
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    return 2000;
  }
}
