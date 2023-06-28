public class Simple
{
    void display()
    {
        System.out.println("HELLOO");
    }
}
class Simple1 extends Simple {
    void show() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        Simple1 obj = new Simple1();
        obj.show();
        obj.display();


    }
}