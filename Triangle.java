public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a,Point b,Point c){
    v1=a;
    v2=b;
    v3=c;
  }

  public Triangle(double x1, double y1,
                  double x2, double y2,
                  double x3, double y3){
    v1=new Point(x1,y1);
    v2=new Point(x2,y2);
    v3=new Point(x3,y3);
  }

  public double getPerimeter(){
    double s1,s2,s3;
    s1=v1.distanceTo(v2);
    s2=v2.distanceTo(v3);
    s3=v3.distanceTo(v1);
    return s1+s2+s3;
  }

  public double getArea(){
    double s1,s2,s3,s,a;
    s1=v1.distanceTo(v2);
    s2=v2.distanceTo(v3);
    s3=v3.distanceTo(v1);
    s=getPerimeter()/2;
    a=s*(s-s1)*(s-s2)*(s-s3);
    a=Math.sqrt(a);
    return a;
  }

  public String classify(){
    double s1,s2,s3;
    s1=v1.distanceTo(v2);
    s2=v2.distanceTo(v3);
    s3=v3.distanceTo(v1);
    s1=Math.round(s1*10000)/10000;
    s2=Math.round(s2*10000)/10000;
    s3=Math.round(s3*10000)/10000;
    if(s1==s2&&s2==s3){
      return "equilateral";
    }
    if(s1==s2||s2==s3||s3==s1){
      return "isosceles";
    }
    return "scalene";
  }
/*
  public String toString(){

  }*/
}
