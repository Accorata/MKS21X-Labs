import java.util.Arrays;
public class Test {
  public static void main(String[] args){
    int result;
    result = binarySearch.binarySearch(new int[]{},0);
    System.out.println(result);//should be 3
    result = binarySearch.binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1
    result = binarySearch.binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0
    //...
    result = binarySearch.binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6
    //Tip: You can use a loop to find if it works on 0,1,2,3,4,5,and 6 in this array!
    int[] test1 = new int[(int) (Math.random()*10)];
    for (int i = 0; i<test1.length; i++){
      test1[i] = (int) (Math.random()*100);
    }
    Arrays.sort(test1);
    for (int i = 0; i<test1.length; i++){
      System.out.println(i + ": " + test1[i]);
      System.out.println(test1[i] + ": " + binarySearch.binarySearch(test1, test1[i]));
    }
  }
}
