package javaAnswerKey;

class Simple
{
    public void exceptionImplementation() throws ArithmeticException {
        try {
            int x=10/0;
            System.out.println("ERROR");
      }
        catch(Exception abc ){
          abc.printStackTrace();
            System.out.println(abc);
            System.out.println("Run successfully");
            throw new ArithmeticException("Error message");
        }
        finally {
            System.out.println("RUN");
        }
    }

}
public class ExceptionHandlingInJava {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.exceptionImplementation();
    }
}
