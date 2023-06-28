package javaAnswerKey;

class CircleCalculation
{
    public  double radius;
    public double pi1,r1;
    CircleCalculation(double pi,double r)
    {
        pi1=pi;
        r1=r;
    }
    public void getRadius()
    {
        radius = pi1*r1*r1;
    }
    public void findArea()
    {
        System.out.println(radius);
    }
}

public class Sample2 {
    public static void main(String[] args) {
        CircleCalculation obj = new CircleCalculation(2.77,3.8);
        CircleCalculation obj1 = new CircleCalculation(6.8, 5.9);
        obj1.getRadius();
        obj.findArea();

    }
}
