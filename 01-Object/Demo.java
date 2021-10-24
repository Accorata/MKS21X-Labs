public class Demo{
  /* more methods can go here*/
  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
  }

  public static void main(String[]args){
    Point P1 = new Point(0,0);
    Point P2 = new Point(3,4);

    System.out.println(  distance(P1,P2)); //call1
    //System.out.println(  Point.distance(P1,P2)); //call 2
    //System.out.println(  P1.distanceTo(P2)); //call 3
    //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
