public class ParseInt {
  public static void main(String[] args){
    String s = "345678";
    System.out.println(stringToInt(s));
  }
  public static int stringToInt(String s){
    int ans = 0;
    for (int i = 0; i<s.length(); i++){
      ans *= 10;
      ans += valueOfChar(s.charAt(i));
    }
    return ans;
  }
  public static int valueOfChar(char c){
    return c - '0';
  }
}
