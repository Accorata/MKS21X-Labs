import java.util.Arrays;
public class Sorts{
  public static void main(String[] args){
    //int[] test = new int[] {5, 1, 12, -5, 16};
    int[] test = new int[] {6, 1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(test));
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
  }
  public static void bubbleSort(int[] data){
    int swaps = 0;
    int end = data.length-1;
    int temp = 0;
    for (int i = 0; i<data.length; i++){
      swaps = 0;
      for (int j = 0; j<end; j++){
        if (data[j] > data[j+1]){
          temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
          swaps++;
        }
      }
      if (swaps == 0) end = 0;
      end--;
    }
  }
  public static void selectionSort(int[] data){
    if (data.length > 0) {
      int[] min = new int[] {data[0], 0};
      for (int i = 0; i<data.length-1; i++){
        for (int j = i; j<data.length; j++){
          if (data[j] < min[0]) {
            min[0] = data[j];
            min[1] = j;
          }
        }
        data[min[1]] = data[i];
        data[i] = min[0];
        min[0] = data[i+1];
        min[1] = i+1;
      }
    }
  }
  public static void insertionSort(int[] data){
    int current;
    for (int i = 1; i<data.length; i++){
      if (data[i] < data[i-1]) {
        current = data[i];
        System.out.println(current);
        for (int j = i; j>0; j--){
          if (current < data[j-1]) {
            data[j-1] = current;
          } else {
            data[j] = current;
            j = 0;
          }
        }
      }
    }
  }
}
