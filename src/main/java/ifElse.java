import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ifElse
{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int a = sn.nextInt();
        if(a<=5)
            System.out.println("The number is lesser than five");
        else if(a>5)
        {
            System.out.println("Thev given number is above five");
        }
    }
}
