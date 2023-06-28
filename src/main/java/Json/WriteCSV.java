package Json;

import javax.sound.midi.Soundbank;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Name").append(",").
                append("Email").append(",").append("PhoneNumber").append("\n");

        stringBuilder.append("Pooja").append(",").
                append("pooja@gmail.com").append(",").append("9786669733").append("\n");

        stringBuilder.append("Raj").append(",").
                append("raj@gmail.com").append(",").append("9786669855").append("\n");

        try(FileWriter fileWriter = new FileWriter("D:\\csv1.csv"))
        {
            fileWriter.write(stringBuilder.toString());
            System.out.println("CSV File created Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
