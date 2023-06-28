package Java8;

interface A{
    void display();
}
class Impl implements A{

    @Override
    public void display() {
        System.out.println("Hello");
    }
}
public class LambdaHandOn {
    public static void main(String[] args) {
//        A obj= new A() {
//            @Override
//            public void display() {
//                System.out.println("HelloWorld");
//            }
//        };
//        obj.display();

        A a = () -> {
            System.out.println("Functional interface");
        };
        a.display();


    }


}
