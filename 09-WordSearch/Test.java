public class Test{
  public static void main(String[] args){
    WordSearch a = new WordSearch(10,5);
    System.out.println(a);
    System.out.println("----");
    a.addWordVertical("hello",3,4);
    a.addWordHorizontal("yu",0,1);
    a.addWordHorizontal("yuertyui",0,1);
    System.out.println(a.addWordVertical("WAYYYYYYYYTOOOLONGGG",4,1));
    System.out.println(a.addWordVertical("ab",4,9));
    a.addWordHorizontal("the",1,5);
    a.addWordHorizontal("error",0,6);
    a.addWordDiagonal("cool",6,1);
    System.out.println(a);
  }
}
