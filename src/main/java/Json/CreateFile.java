package Json;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        boolean result;
        File file = new File("D:\\text1.txt");
        try {
            result = file.createNewFile();
            if(result==true){
                System.out.println("File Created successfully " +file.getCanonicalPath());
            }
            else {
                System.out.println("Failed to create a file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
