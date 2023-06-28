package StringConcepts;

public class ToStringMethod {
    int rollNo;
    String name;
    String city;

    ToStringMethod(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() { //without toString method we can't able to get the values
        return "ToStringMethod{" +
                " rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String args[]) {
        ToStringMethod s1 = new ToStringMethod(101, "Raj", "lucknow");
        ToStringMethod s2 = new ToStringMethod(102, "Vijay", "ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()
        System.out.println(s2);//compiler writes here s2.toString()
    }
}


