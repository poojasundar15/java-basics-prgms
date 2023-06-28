package Java8;

@FunctionalInterface  //It is optional
interface Drawable{
    public void draw();
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=()->
            System.out.println("Drawing "+width);

        {
           System.out.print("Hello ");
        };
        {
            System.out.println("World");
        };
        d2.draw();
    }
}

