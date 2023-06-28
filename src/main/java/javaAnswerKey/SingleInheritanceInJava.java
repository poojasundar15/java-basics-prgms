package javaAnswerKey;

class A{
    public int r1=10;
    public void display()
    {
        System.out.println("Super class");
    }
}
class B extends A{
    int r2=20;
    public void show() {
        System.out.println(r1);
    }
}
class C extends A{

}
public class SingleInheritanceInJava {
    public static void main(String[] args) {
        C obj = new C();
        B obj1= new B();
        obj1.show();
        obj.display();

    }
}
