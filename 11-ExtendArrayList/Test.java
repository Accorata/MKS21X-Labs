public class Test{
  public static void main(String[] args){
    OrderedArrayList<String> a = new OrderedArrayList<String>();
    NoNullArrayList<Integer> b = new NoNullArrayList<Integer>(5);
    OrderedArrayList<Integer> c = new OrderedArrayList<Integer>(3);
    System.out.println(a.add("test"));
    System.out.println(a.add("abc"));
    System.out.println(a.add("abc"));
    a.add(3,"abc");
    a.add(0, "yes");
    System.out.println(a);
    System.out.println(a.set(0, "create"));
    System.out.println(a.set(3, "testing"));
    //System.out.println(a.add(null));
    //System.out.println(b.add(1));
    //b.add(0,4);
    //b.add(1,null);
    //System.out.println(a.set(0, "testing"));
    //System.out.println(b.set(0, null));
    System.out.println(a);
    //System.out.println(b);
    a.add(null);
    c.add(56);
    c.add(456);
    c.add(-45678);
    c.add(-1);
    c.add(1);
    System.out.println(c);
    System.out.println(c.set(0, 2000000));
    System.out.println(c);
  }
}
