public class Screen {
  public static void main(String[] args){
    Text.hideCursor();
    Text.clear();
    for(int i = 0; i<30; i++){
      Text.go(i+1,1);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
      //Text.go(i+1,80);
      //System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    for(int i = 0; i<80; i++){
      Text.go(1,i+1);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    Text.go(31,1);
    Text.showCursor();
  }
}
