import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String> replaceEmpty (ArrayList<String> data){
    ArrayList newData = new ArrayList<String>();
    for(int i = 0; i<data.size(); i++){
      if(data.get(i).length() == 0) newData.add("Empty");
      else { newData.add(data.get(i)); }
    }
    return newData;
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> data){
    ArrayList newData = new ArrayList<String>();
    for(int i = data.size()-1; i>=0; i--){
      newData.add(data.get(i));
    }
    return newData;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList newData = new ArrayList<String>();
    for(int i = 0; i > a.size()+b.size(); i++){
      try {
        if (i % 2 == 0){
          newData.add(a.get(i/2));
        } else {
          newData.add(b.get(i/2));
        }
      } catch (IndexOutOfBoundsException e) {
      }
    }
    return newData;
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
  }
}
