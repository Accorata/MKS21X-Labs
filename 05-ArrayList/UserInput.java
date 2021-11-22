import java.util.Scanner;
public class UserInput {
  public static void main(String[] args){
    String finalList = "";
    int total = -1;
    double min = 0, max = 0, sum = 0, last = 0;
    Scanner in = new Scanner (System.in);
    int count = 0;
    while (last >= 0) {
      total++;
      sum += last;
      System.out.println("Enter a non negative number. A negative number will end the program:");
      last = Double.parseDouble( in.nextLine() );
      if (last < min && last >= 0) min = last;
      if (last > max) max = last;
      if (last >= 0) finalList += last + ", ";
      if (count == 0 && last >= 0) min = last;
      count++;
    }
    in.close();
    double mean = 0;
    if (total != 0) mean = sum/total;
    if (finalList.length() > 0) {
      System.out.println("You entered: [" + finalList.substring(0, finalList.length()-2) + "]");
    } else {
      System.out.println("You entered: []");
    }
    System.out.println("Mean: "+mean);
    System.out.println("Min value: "+min);
    System.out.println("Max value: "+max);
  }
}
