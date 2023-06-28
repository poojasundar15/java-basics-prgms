public class ProtectedKeyword {
    protected void display() {
        System.out.println("Protected keyword");
    }
}
class second extends ProtectedKeyword {
    void show() {
        this.display();
    }

    public static void main(String[] args) {
        second obj = new second();
        obj.show();
    }
}
