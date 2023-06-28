public interface A
{
    void show();
}
interface B
{
    void show1();
}
class C implements A,B
{
    @Override
    public void show() {
        System.out.println("hello world");
    }
    @Override
    public void show1()
    {
        System.out.println("Second world");

    }
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show1();

    }
}


