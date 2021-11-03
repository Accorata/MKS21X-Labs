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
    System.out.println(gcd(45,210)); //15
    System.out.println(gcd(210,200)); //10
    System.out.println(a.getValue()); //0.5
    RationalNumber b = new RationalNumber(1,2);
    System.out.println(b.equals(a)); //true
    RationalNumber c = a.reciprocal();
    System.out.println(c); //2/1
    RationalNumber d = new RationalNumber(100,75);
    System.out.println(d.multiply(c)); //8/3
    System.out.println(a.multiply(b)); //1/4
    System.out.println(a.divide(a)); //1/1
    RationalNumber e = a.add(a);
    System.out.println(e); //1/1
    System.out.println(e.getValue()); //1.0
    System.out.println(d.subtract(e)); //1/3
    RealNumber r1 = new RealNumber(1);
    RealNumber r2 = new RealNumber(20);
    RealNumber r3 = new RealNumber(3);
    RealNumber r4 = new RealNumber(7);
    System.out.println(r1.subtract(e)); //0.0
    System.out.println(r2.add(d)); //21.3333333333
    System.out.println(r3.divide(a)); //6.0
    System.out.println(r4.multiply(r2)); //140.0
    RationalNumber f = new RationalNumber(-20,5);
    System.out.println(f);
    RationalNumber g = new RationalNumber(12,4);
    System.out.println(r3.equals(g)); //true
    System.out.println(r3.equals(f)); //false
    System.out.println(r2.compareTo(d)); //1
    System.out.println(r3.compareTo(g)); //0
    System.out.println(r1.compareTo(g)); //-1
  }
}
