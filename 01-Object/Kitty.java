public class Kitty {
  private int age;
  private String name;
  public Kitty (){
    age = 2;
    name = "Mittens";
  }
  public Kitty (String startName, int startAge){
    age = startAge;
    name = startName;
  }
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
  public void makeOlder(){
    age++;
  }
  public void changeName(String newName){
    name = newName;
  }
  public String toString(){
    return "The amazing " + name;
  }
}
