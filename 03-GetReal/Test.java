public class Test {
  private static int gcd(int a, int b){
    int lastDivisor = b;
    int currentDivisor = a;
    int storage;
    if (a > b) {
      lastDivisor = a;
      currentDivisor = b;
    }
    while (lastDivisor % currentDivisor != 0){
      storage = currentDivisor;
      currentDivisor = lastDivisor % currentDivisor;
      lastDivisor = storage;
    }
    return currentDivisor;
  }

  public static void main(String[] args){
    RationalNumber a = new RationalNumber(1,2);
    System.out.println(gcd(45,210));
    System.out.println(gcd(210,200));
    System.out.println(a.getValue());
    RationalNumber b = new RationalNumber(1,2);
    System.out.println(b.equals(a));
    RealNumber c = a.reciprocal();
    System.out.println(c);
    RationalNumber d = new RationalNumber(100,75);
    d.reduce();
    System.out.println(d);
  }
}
