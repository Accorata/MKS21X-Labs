public class Recursion {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(isEven(n));
  }
  public static int fact(int n){
    if (n == 0) return 1;
    return n*fact(n-1);
  }
  public static boolean isEven (int x){
    if (x == 0) return true;
    if (x == 1) return false;
    if (x < 0) return isEven(-x);
    return isEven(x-2);
  }
}
