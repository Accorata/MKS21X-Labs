public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray (){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public void add (String element){
    data[size] = element;
    size++;
  }

  public String toString(){
    String ans = "[";
    for (int i = 0; i < size; i++){
      ans += data[i];
      if (i + 1 != size) ans += ", ";
    }
    return ans + "]";
  }

  public String toStringDebug(){
    String ans = "[";
    for (int i = 0; i < data.length; i++){
      ans += data[i];
      if (i + 1 != data.length) ans += ", ";
    }
    return ans + "]";
  }
}
