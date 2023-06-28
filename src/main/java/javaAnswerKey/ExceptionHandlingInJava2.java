package javaAnswerKey;

import java.io.IOException;

class Exception1{
    public void exceptionShow() throws IOException
    {
        try{
            int a=10/0;
            // System.out.println("ERROR");
            throw new ArithmeticException("HANDLED");
        }
        catch (Exception o)
        {
            o.printStackTrace();
            System.out.println(o);
            System.out.println("ERROR HANDLED");
        }
        finally {
            System.out.println("RUN SUCCESSFULLY");
        }

    }
}
public class ExceptionHandlingInJava2 {
    public static void main(String[] args) throws IOException {
        Exception1 obj = new Exception1();
        obj.exceptionShow();
    }
}
