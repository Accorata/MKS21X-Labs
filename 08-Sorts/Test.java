import java.util.*;
public class Test {
  public static void main(String[] args){
    testSort(0);
  }
  public static int[] randomArray(int len, int min, int max){
    int[] ans = new int[len];
    for (int i = 0; i<len; i++){
      ans[i] = (int)(Math.random()*(max-min+1))+min;
    }
    return ans;
  }
  public static int[] randomSortedArray(int len, int min, int max){
    int[] ans = randomArray(len, min, max);
    Arrays.sort(ans);
    return ans;
  }
  public static int[] randomReverseArray(int len, int min, int max){
    int[] arr = randomSortedArray(len, min, max);
    int[] ans = new int[len];
    for (int i = 0; i<len; i++){
      ans[i]=arr[len-1-i];
    }
    return ans;
  }
  public static int[][] generateCurrentTests(){
    int[][] testCases = new int[5][0];
    testCases[0] = randomArray(10,0,10); //0 = randomArray
    testCases[1] = randomSortedArray(10,0,10); //1 = randomSortedArray
    testCases[2] = randomReverseArray(10,0,10); //2 = randomReverseArray
    testCases[3] = randomArray(10,-1,1); //3 = similar
    testCases[4] = new int[0]; //4 = nothing
    return testCases;
  }
  public static int[] copy (int[] arr){
    int[] ans = new int[arr.length];
    for (int i = 0; i<arr.length; i++){
      ans[i] = arr[i];
    }
    return ans;
  }
  public static boolean compare (int[] arr1, int[] arr2){
    if (arr1.length != arr2.length) return false;
    for (int i = 0; i<arr1.length; i++){
      if (arr1[i] != arr2[i]) return false;
    }
    return true;
  }
  public static void testSort (int test){
    int[][] tests = generateCurrentTests();
    for(int i = 0; i<tests.length; i++){
      System.out.println(Arrays.toString(tests[i]));
      int [] correctSort = copy(tests[i]);
      Arrays.sort(correctSort);
      int [] testedSort = copy(tests[i]);
      if(test == 0) Sorts.bubbleSort(testedSort);
      System.out.println(compare(correctSort, testedSort));
    }
  }
}
