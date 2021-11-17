import java.util.ArrayList;
public class Test {
  public static void main(String[] args){
    ArrayList a = new ArrayList<String>();
    a.add("fyuui");
    a.add("");
    a.add("And this");
    a.add("What to add");
    a.add("I shouldn't just add random stuff");
    a.add("...");
    a.add("");
    a.add("Right?");
    ArrayList b = new ArrayList<String>();
    b.add("");
    b.add("I need more cases don't I");
    System.out.println(a);
    //System.out.println(a.toStringDebug());
    System.out.println(ArrayListPractice.replaceEmpty(a));
    System.out.println(ArrayListPractice.makeReversedList(a));
    System.out.println(ArrayListPractice.mixLists(ArrayListPractice.replaceEmpty(b),a));
    System.out.println(ArrayListPractice.mixLists(a,b));
  }
}
