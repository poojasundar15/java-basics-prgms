package cat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreReader {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = input.nextLine();

        try {
            File file = new File(filename);
            Scanner fileInput = new Scanner(file);

            int sum = 0;
            int count = 0;

            while (fileInput.hasNextInt()) {
                int score = fileInput.nextInt();
                sum += score;
                count++;
            }

            double average = (double) sum / count;

            System.out.println("Total: " + sum);
            System.out.printf("Average: %.2f", average);

            fileInput.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
