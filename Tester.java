public class Tester{
  public static void main(String[] args){
    Point z=new Point(0,0);
    Point a=new Point(1,2);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(z));
    System.out.println(a.distanceTo(a));
  }
}
