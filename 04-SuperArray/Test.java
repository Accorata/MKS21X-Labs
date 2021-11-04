public class Test {
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    System.out.println(a.toStringDebug());
    a.add("This");
    a.add("And this too");
    System.out.println(a.toStringDebug());
    System.out.println(a);
  }
}
