import java.util.*;
public class Test {
  public static void main(String[] args){
    //testSort(2);
    System.out.println("Bubble Sort: "+finalTests(0));
    System.out.println("Selection Sort: "+finalTests(1));
    System.out.println("Insertion Sort: "+finalTests(2));
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
    testCases[1] = randomSortedArray(25,-4,10); //1 = randomSortedArray
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
      System.out.println("1: " + Arrays.toString(tests[i]));
      int [] correctSort = copy(tests[i]);
      System.out.println(Arrays.toString(correctSort));
      Arrays.sort(correctSort);
      int [] testedSort = copy(tests[i]);
      System.out.println(Arrays.toString(testedSort));
      testedSort = determineSort(testedSort, test);
      System.out.println(compare(correctSort, testedSort));
    }
  }
  public static boolean finalTests(int test){
    int[][] tests = new int[100000][0]; //I'm assuming this is enough
    boolean works = true;
    for (int i = 0; i<tests.length; i++){
      if(i % 5 == 0) tests[i] = randomArray((int)(Math.random()*100),-1000,1000);
      if(i % 5 == 1) tests[i] = randomSortedArray((int)(Math.random()*100),-1000,1000);
      if(i % 5 == 2) tests[i] = randomReverseArray((int)(Math.random()*100),-1000,1000);
      if(i % 5 == 3) tests[i] = randomArray((int)(Math.random()*100),-3,3);
      if(i % 5 == 4) tests[i] = new int[0];
    }
    for (int i = 0; i<tests.length; i++){
      int [] correctSort = copy(tests[i]);
      Arrays.sort(correctSort);
      int [] testedSort = copy(tests[i]);
      testedSort = determineSort(testedSort, test);
      if(!compare(correctSort, testedSort)){
        System.out.println(i + ": " + Arrays.toString(tests[i]));
        System.out.println(Arrays.toString(correctSort));
        System.out.println(Arrays.toString(testedSort));
        System.exit(1);
      }
    }
    return works;
  }
  public static int[] determineSort(int[] arr, int test){
    if(test == 0) Sorts.bubbleSort(arr);
    else if(test == 1) Sorts.selectionSort(arr);
    else if(test == 2) Sorts.insertionSort(arr);
    return arr;
  }
}
