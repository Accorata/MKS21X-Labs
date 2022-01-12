public class Screen {
  public static void main(String[] args){
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
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
      Text.go(29,i);
      System.out.println(Text.colorize(" ",Text.GREEN+Text.BACKGROUND));
    }
    for(int i = 0; i<4; i++){
      int num = (int)(Math.random()*100);
      Text.go(3,16+i*16);
      int color = Text.BLACK;
      if (num < 25) color = Text.RED;
      if (num > 75) color = Text.GREEN;
      System.out.println(Text.colorize(""+num,color));
    }
    Text.go(30,1);
    Text.showCursor();
  }
}
