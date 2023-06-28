class ThisKeyword {
    public void display() {
        System.out.println("Hello");
    }

    public void show() {
        this.display();
        System.out.println("World");
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.show();

    }
}
