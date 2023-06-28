import java.util.Scanner;

public class BreakClass {
    public static void main(String[] args) {
//        for (int i = 0; i <= 5; i++) {
//            if (i == 4)
//                break;
//            System.out.println("i = " + i);
//        }
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = s.nextInt();
        switch (a) {
            case 1:
                System.out.println("First class");
            case 2:
                System.out.println("Second class");
            case 3:
                System.out.println("Third class");
            default:
                System.out.println("Default class");

        }
    }
}
