public class Tester{
  public static void main(String[] args){
    Point z=new Point(0,0);
    Point a=new Point(1,2);
    Point b=new Point(3,0);
    Point a1=new Point(a);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println(a.distanceTo(z));
    System.out.println(a.distanceTo(a));
    System.out.println(a.equals(z));
    System.out.println(a.equals(a1));
    //Triangle
    Triangle bob=new Triangle(z,a,b);
    Triangle isos=new Triangle(0,0, 1,1, 2,0);
    System.out.println(bob.getPerimeter());
    System.out.println(bob.getArea());
    System.out.println(bob.classify());
    System.out.println(isos.classify());
    System.out.println(bob);
    System.out.println(bob.toString());
  }
}
