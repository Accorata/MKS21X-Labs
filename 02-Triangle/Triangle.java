public class Triangle {
  private Point v1, v2, v3;

  public Triangle (Point V1, Point V2, Point V3){
    v1 = new Point(V1);
    v2 = new Point(V2);
    v3 = new Point(V3);
  }

  public Triangle (double v1x, double v1y, double v2x, double v2y, double v3x, double v3y){
    v1 = new Point(v1x, v1y);
    v2 = new Point(v2x, v2y);
    v3 = new Point(v3x, v3y);
  }

  public double getPerimeter (){
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex (int i){
    if (i == 1) return v1;
    if (i == 2) return v2;
    return v3;
  }

  public void setVertex (int i, Point newV){
    if (i == 1) v1 = newV;
    if (i == 2) v2 = newV;
    if (i == 3) v3 = newV;
  }

  public static boolean closeEnough(double a, double b){
    if (a == 0 || b == 0) return a == b;
    return 2*Math.abs(a - b)/(a + b) <= 0.00001;
  }

  public boolean equals(Triangle other){
    return v1.equals(other.getVertex(1)) && v2.equals(other.getVertex(2)) && v3.equals(other.getVertex(3));
  }

  public String classify(){
    int equalSides = 0;
    if (closeEnough(v1.distanceTo(v3), v1.distanceTo(v2))) equalSides++;
    if (closeEnough(v2.distanceTo(v3), v2.distanceTo(v1))) equalSides++;
    if (closeEnough(v3.distanceTo(v2), v3.distanceTo(v1))) equalSides++;
    if (equalSides == 1) return "isoscelese";
    if (equalSides == 3) return "equilateral";
    return "scalene";
  }

  public double area(){
    double s = getPerimeter() / 2;
    return Math.sqrt(s*(s-v1.distanceTo(v2))*(s-v2.distanceTo(v3))*(s-v3.distanceTo(v1)));
  }

  public String toString (){
    return "{" + v1 + ", " + v2 + ", " + v3 + "}";
  }
}
