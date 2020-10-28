public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    double x1=x;
    double y1=y;
    double x2=other.getX();
    double y2=other.getY();
    double dist=0;
    dist = (Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
    dist = Math.sqrt(dist);
    return dist;
  }

  public boolean equals(Point other){
    if(x==other.getX()){
      return y==other.getY();
    }
    return false;
  }

}
