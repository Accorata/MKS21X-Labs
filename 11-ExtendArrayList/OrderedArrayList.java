public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  @Override
  public T set(int index, T t){
    T temp = super.remove(index);
    add(t);
    return temp;
  }
  @Override
  public boolean add(T t){
    super.add(WhereToPlace(t), t);
    return true;
  }
  @Override
  public void add(int index, T t){
    add(t);
  }
  private int WhereToPlace(T value){
    if (value == null) return null;
    int ans = 0;
    for (int i = 0; i<size(); i++){
      if (value.compareTo(get(i)) < 0){
        return ans;
      }
      ans++;
    }
    return ans;
  }
}
