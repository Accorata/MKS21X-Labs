import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public T set(int index, T t){
    if (t == null) {
      throw new IllegalArgumentException ("NoNullArrayList does not accept null values");
    } else {
      return super.set(index, t);
    }
  }
  public boolean add(T t){
    if (t == null) {
      throw new IllegalArgumentException ("NoNullArrayList does not accept null values");
    } else {
      return super.add(t);
    }
  }
  public void add(int index, T t){
    if (t == null) {
      throw new IllegalArgumentException ("NoNullArrayList does not accept null values");
    } else {
      super.add(index, t);
    }
  }
}
