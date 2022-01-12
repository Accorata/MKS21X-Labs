import java.util.Scanner;
public class Screen {
  public static void main(String[] args){
    int[] num = randFour();
    display(num);
    Scanner input = new Scanner (System.in);
    String last = "";
    while(last != "q" && last != "quit"){
      if (last != "") num = randFour();
      display(num);
      last = input.nextLine().toLowerCase();
      //last = "q";
    }
    input.close();
  }
  private static void display(int[] num){
    Text.hideCursor();
    Text.clear();
    for(int i = 0; i<30; i++){
      Text.go(i,0);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
      Text.go(i,79);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    for(int i = 0; i<80; i++){
      Text.go(0,i);
      System.out.print(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
      Text.go(29,i);
      System.out.print(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    for(int i = 0; i<4; i++){
      Text.go(3,16+i*16);
      int color = Text.WHITE;
      if (num[i] < 25) color = Text.RED;
      if (num[i] > 75) color = Text.GREEN;
      System.out.println(Text.colorize(""+num[i],color));
    }
    Text.go(30,1);
    Text.showCursor();
    System.out.print(Text.colorize(">",Text.GREEN));
  }
  private static int[] randFour(){
    int[] num = new int[4];
    for(int i = 0; i<4; i++){
      num[i] = (int)(Math.random()*100);
    }
    return num;
  }
}
