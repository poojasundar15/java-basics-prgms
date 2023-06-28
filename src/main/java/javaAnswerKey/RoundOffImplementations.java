package javaAnswerKey;

import java.util.Scanner;
class RoundOff {
    public static double roundToTenth(double num) {
        return (double)
                Math.round(num * 10) / 10;
    }
    public static double roundToHundredth(double num) {
        return (double)
                Math.round(num * 100) / 100;
    }
}
public class RoundOffImplementations
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = scanner.nextDouble();
        double roundedToTenth = RoundOff.roundToTenth(num);
        double roundedToHundredth = RoundOff.roundToHundredth(num);
        System.out.println("Rounded to nearest tenth: " + roundedToTenth);
        System.out.println("Rounded to nearest hundredth: " +
                roundedToHundredth);
    }
}
