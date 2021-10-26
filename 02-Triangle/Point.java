public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
  }

  public double distanceTo(Point p2){
    return Math.sqrt(Math.pow(x-p2.getX(), 2)+Math.pow(y-p2.getY(), 2));
  }

  public static boolean closeEnough(double a, double b){
    if (a == 0 || b == 0) return a == b;
    return a/b <= 0.00001;
  }

  public boolean equals(Point other){
    return closeEnough(x, other.getX()) && closeEnough(y, other.getY());
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
