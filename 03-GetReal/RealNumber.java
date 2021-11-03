public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double add(RealNumber other){
     return this.getValue() + other.getValue();
  }

  public double multiply(RealNumber other){
    return this.getValue() * other.getValue();
  }

  public double divide(RealNumber other){
    return this.getValue() / other.getValue();
  }

  public double subtract(RealNumber other){
    return this.getValue() - other.getValue();
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public int compareTo(RealNumber other){
    if (this.getValue() > other.getValue()) return 1;
    if (this.getValue() < other.getValue()) return -1;
    return 0;
  }

  public boolean equals(RealNumber other){
    return this.getValue() == other.getValue();
  }
}
