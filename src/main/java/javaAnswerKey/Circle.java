package javaAnswerKey;


class Circle1 {
    double pi =3.14;
    int r=0;

    public Circle1(double pi, int r) {
        this.pi = pi;
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public int getR() {
        return r;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void getRadius(int a)
    {
        getPi();
        getR();
        setPi(pi);
        setR(r);
    }
    public void findArea()
    {

        int radius = (int) (pi+(r*r));
        System.out.println("Area of radius = "+radius);
    }
}
public class Circle{
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(3.14,55);
        circle1.getRadius(8);
        circle1.findArea();
    }
}
