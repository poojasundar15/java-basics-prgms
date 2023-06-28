import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        int i = 5;
//        Scanner sn = new Scanner(System.in);
//        System.out.println("Enter the number ");

       // int num = sn.nextInt();
        int num=33;

        for (int j=1;j<=num;j++)
        {
            num = num*j;
            System.out.println(num);
        }
    }
}
