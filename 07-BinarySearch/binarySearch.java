public class binarySearch {
  public static int binarySearch(int[]data, int target){
    int start = 0, end = data.length-1, mid = (start + end)/2;
    while (start <= end){
      if (data[mid] < target){
        start = mid + 1;
      } else if (data[mid] > target){
        end = mid - 1;
      } else {
        return mid;
      }
      mid = (start + end)/2;
    }
    return -1;
  }
}
