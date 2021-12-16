public class Test{
  public static void main(String[] args){
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    NoNullArrayList<Integer> b = new NoNullArrayList<Integer>(5);
    System.out.println(a.add("test"));
    //System.out.println(a.add(null));
    System.out.println(b.add(1));
    b.add(0,4);
    //b.add(1,null);
    System.out.println(a.set(0, "testing"));
    //System.out.println(b.set(0, null));
    System.out.println(a);
    System.out.println(b);
  }
}
