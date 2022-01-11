public class Screen {
  public static void main(String[] args){
    Text.hideCursor();
    Text.clear();
    for(int i = 0; i<30; i++){
      Text.go(i,0);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    // }
    // for(int i = 0; i<30; i++){
      Text.go(i,79);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    for(int i = 0; i<80; i++){
      Text.go(0,i);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    // }
    // for(int i = 0; i<80; i++){
      Text.go(29,i);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    Text.go(30,1);
    Text.showCursor();
  }
}
