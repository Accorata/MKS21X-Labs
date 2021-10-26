public class Driver{
  public static void main(String[]args){
    Point P1 = new Point(0,0);
    Point P2 = new Point(3,4);
    Point P3 = new Point(1,1);
    Point P4 = new Point(0,1);
    Point P5 = new Point(0,10);

    Triangle T1 = new Triangle (P1, P3, P4);
    Triangle T2 = new Triangle (0, 0, 3, 4, 0, 4);
    Triangle T3 = new Triangle (P1, P3, P5);

    System.out.println(T1);
    System.out.println(T2);
    System.out.println(T1.getVertex(2));
    System.out.println(T3.getVertex(3));
    System.out.println(T3);
    T3.setVertex(2, P4);
    System.out.println(T3);
    System.out.println(T1.getPerimeter());
    System.out.println(T2.getPerimeter());
  }
 }
