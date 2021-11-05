public class Test {
  public static void main(String[] args){
    SuperArray a = new SuperArray(4);
    System.out.println(a.toStringDebug());
    a.add("This");
    a.add("And this too");
    a.add("More");
    System.out.println(a.toStringDebug());
    a.add("More");
    a.add("More!");
    System.out.println(a.toStringDebug());
    a.add("Ok what else");
    a.add("I'm only at 7");
    a.add("3 more");
    a.add("Well actually 2 more or now only 1 more");
    a.add("10 cases complete!");
    System.out.println(a.toStringDebug());
    System.out.println(a);

    System.out.println("");
    for (int i = 0; i<a.size(); i++){
      System.out.println(a.get(i));
    }
    for (int i = 0; i<a.size(); i++){
      a.set(i, ""+(i*5+2));
    }
    System.out.println(a);
    for (int i = 0; i<a.size()-1; i++){
      a.set(i, a.get(i+1));
    }
    a.set(a.size()-1, "NOPE!");
    System.out.println(a);

  }
}
