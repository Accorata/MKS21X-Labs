public class Driver{
  public static void main(String[]args){
    Point P1 = new Point(0,0);
    Point P2 = new Point(3,4);
    Point P3 = new Point(1,1);
    Point P4 = new Point(0,1);
    Point P5 = new Point(0,10);

    Triangle T1 = new Triangle (P1, P3, P4);
    Triangle T2 = new Triangle (0, 0, 3, 4, 0, 4);
    Triangle T4 = new Triangle (0.000000001, 0, 2.9999999, 4, 0, 3.999999);
    Triangle T3 = new Triangle (P1, P3, P4);
    Triangle T6 = new Triangle (1,1, 1,2, 2,2);
    Triangle T5 = new Triangle (0,0,1,0,0.5,0.86602540378);

    System.out.println(T1);
    System.out.println(T2);
    System.out.println(T1.getVertex(2));
    System.out.println(T3.getVertex(3));
    System.out.println(T3);
    System.out.println(T3.classify());
    System.out.println(T6.classify());
    System.out.println(T3.area());
    System.out.println(T2.getPerimeter());
    System.out.println(T2.area());
    System.out.println(T3.equals(T4));
    System.out.println(T3.equals(T1));
    System.out.println(T3.classify());
    System.out.println(T5.classify());

  }
 }
