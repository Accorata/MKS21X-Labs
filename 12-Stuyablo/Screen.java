public class Screen {
  public static void main(String[] args){
    Text.hideCursor();
    Text.clear();
    for(int i = 0; i<30; i++){
      Text.go(i+1,1);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
  }
}
