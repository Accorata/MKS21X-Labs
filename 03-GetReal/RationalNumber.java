public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0){
      numerator = 0;
      denominator = 0;
    } else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue(){
    return numerator/denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber (denominator, numerator);
  }

  public boolean equals(RationalNumber other){
    return numerator == other.getNumerator() && denominator == other.getDenominator();
  }

  public String toString(){
    return "" + numerator + "/" + denominator;
  }

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

  public void reduce(){
    int gcd = gcd(numerator,denominator);
    numerator /= gcd;
    denominator /= gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
