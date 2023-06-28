public class BankEncapsulation {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BankEncapsulation obj = new BankEncapsulation();
        obj.setName("Pooja Sundar");
        obj.setId(88);
        System.out.println(obj.getName());
        System.out.println(obj.getId());
    }
}
