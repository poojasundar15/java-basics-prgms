package javaAnswerKey;

import java.io.IOException;

class ExceptionHandling
{
    public void method() {
        try {
            int a=3/0;
            System.out.println(a);
        }
        catch (ArithmeticException exce) {
            exce.printStackTrace();
            System.out.println("Welcome");
        }
    }
}
public class Add
{
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.method();

    }
}