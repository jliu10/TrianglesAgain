public class Tester{
  public static void main(String[] args){
    Point z=new Point(0,0);
    Point a=new Point(1,2);
    Point a1=new Point(a);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(z));
    System.out.println(a.distanceTo(a));
    System.out.println(a.equals(z));
    System.out.println(a.equals(a1));
  }
}
