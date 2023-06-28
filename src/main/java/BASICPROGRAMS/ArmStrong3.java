package BASICPROGRAMS;

import java.util.Scanner;

public class ArmStrong3 {

    public static double numPower(int num,int pow){
        double result=1;
        for(int i=0;i<pow;i++){
            result *= num;
        }
        return result;
    }

    public static int lengOfNum(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {

       // Math.pow()

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the element = ");
        int number = sn.nextInt();
        int originalNumber, remainder;
        double result=0;
        int len= lengOfNum(number);
        originalNumber = number;

        while (originalNumber != 0){
            remainder = originalNumber % 10;
            result += numPower(remainder,len);
            originalNumber /= 10;
        }

        if(result == number){
            System.out.println("The Number " +number+ " is an armstrong ");
        }
        else {
            System.out.println("The number " +number+ " is NOT an armstrong, " +
                    "Your entered element gaves a " +result+ "number as a result");
        }

    }
}
