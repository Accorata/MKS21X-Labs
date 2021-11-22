import java.io.*;
import java.util.Scanner;
public class Triangles {
  public static void main(String[] args){
    System.out.println(problemOne());
    System.out.println(problemTwo());
  }
  public static int problemOne(){
    try {
      File data = new File ("TriangleNumbers.txt");
      Scanner input = new Scanner(data);
      int[] points = new int[3];
      int count = 0;
      while (input.hasNextInt()){
        points[0] = input.nextInt();
        points[1] = input.nextInt();
        points[2] = input.nextInt();
        if (points[0]+points[1]>points[2] && points[0]+points[2]>points[1] && points[1]+points[2]>points[0]) count++;
      }
      input.close();
      return count;
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    return 2000;
  }
  public static int problemTwo(){
    try {
      File data = new File ("TriangleNumbers.txt");
      Scanner input = new Scanner(data);
      int[] points = new int[9];
      int count = 0;
      while (input.hasNextInt()){
        for (int i = 0; i<9; i++){
          points[i] = input.nextInt();
        }
        for (int i = 0; i<3; i++) {
          if (points[0+i]+points[3+i]>points[6+i] && points[0+i]+points[6+i]>points[3+i] && points[3+i]+points[6+i]>points[0+i]) count++;
        }
      }
      input.close();
      return count;
    } catch (FileNotFoundException e){
      e.printStackTrace();
    }
    return 2000;
  }
}
