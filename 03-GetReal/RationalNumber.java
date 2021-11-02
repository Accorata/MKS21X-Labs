public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno == 0){
      numerator = 0;
      denominator = 0;
    } else {
      numerator = nume;
      denominator = deno;
    }
    this.reduce();
  }

  public double getValue(){
    return (double) numerator / denominator;
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

  private void reduce(){
    int gcd = gcd(numerator,denominator);
    numerator /= gcd;
    denominator /= gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber (numerator * other.getNumerator(), denominator * other.getDenominator());
    product.reduce();
    return product;
  }

  public RationalNumber divide(RationalNumber other){
    other = other.reciprocal();
    return this.multiply(other);
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber product = new RationalNumber (numerator * other.getDenominator() + other.getNumerator() * denominator, denominator * other.getDenominator());
    product.reduce();
    return product;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber product = new RationalNumber (numerator * other.getDenominator() - other.getNumerator() * denominator, denominator * other.getDenominator());
    product.reduce();
    return product;
  }
}
