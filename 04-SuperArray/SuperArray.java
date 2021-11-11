public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray (){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0) throw new IllegalArgumentException ("SuperArray requires an integer greater than or equal to 0 not "+initialCapacity);
    data = new String[initialCapacity];
    size = 0;
  }
  public int size(){
    return size;
  }

  private void resize(){
    String[] newData = new String[size*2+1];
    for (int i = 0; i<size; i++){
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean add (String element){
    if (size == data.length) resize();
    data[size] = element;
    size++;
    return true;
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

  public String get(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException ("get() requires integers between 0 and size not "+index);
    }
    return data[index];
  }

  public String set(int index, String element){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException ("set() requires integers between 0 and size not "+index);
    }
    String old = data[index];
    data[index] = element;
    return old;
  }

  public int indexOf(String target) {
    for (int i = 0; i<size; i++){
      if (data[i].equals(target)) return i;
    }
    return -1;
  }

  public int lastIndexOf(String target) {
    for (int i = size-1; i>=size; i--){
      if (data[i] == target) return i;
    }
    return -1;
  }

  public void add(int index, String value) {
    if (index < 0 || index > size){
      throw new IndexOutOfBoundsException ("add() requires integers between 0 and size (inclusive) not "+index);
    } else {
      if (size == data.length) resize();
      for (int i = size; i>index; i--){
        if (i != 0) data[i] = data[i-1];
      }
      data[index] = value;
      size++;
    }
  }

  public String remove(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException ("remove() requires integers between 0 and size (inclusive) not "+index);
    }
    String old = data[index];
    for (int i = index; i<size-1; i++){
      set(i, get(i+1));
    }
    set(size-1, null);
    size--;
    return old;
  }

  public boolean remove(String target){
    return !(remove(indexOf(target)) == null);
  }
}
