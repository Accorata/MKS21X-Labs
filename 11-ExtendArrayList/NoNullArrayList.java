import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public boolean set(int index, T t){
    if (t == null) return false;
    else {
      return this.set(index, t);
    }
  }
  public boolean add(T t){
    if (t == null) return false;
    else {
      return this.add(t);
    }
  }
}
