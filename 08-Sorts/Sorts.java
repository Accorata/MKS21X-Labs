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
}
