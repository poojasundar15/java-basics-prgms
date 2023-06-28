package javaAnswerKey;

interface A1
{
    public void add();
}
interface B1
{
    public void sub();
}
class Implements implements A1,B1 {

    @Override
    public void add() {
        int a = 18;
        System.out.println("Add = "+(a+a));
    }
    @Override
    public void sub() {
        int b= 100;
        int sub= b-10;
        System.out.println("Sub = "+sub);
    }
}
public class InterFaceClass {
    public static void main(String[] args) {
        Implements obj = new Implements();
        obj.add();
        obj.sub();
    }
}

