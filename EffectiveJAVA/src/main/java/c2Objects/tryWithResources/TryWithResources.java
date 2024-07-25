package c2Objects.tryWithResources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Previously try catch finally was the norm. Resources would be closed in the finally block. But it was verbose.
public class TryWithResources {
    public static void main(String[] args) {
        // Source and destination files
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Using try-with-resources to automatically close resources
        try (
                FileInputStream fis = new FileInputStream(sourceFile);
                FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {
            int data;
            // Read from source file and write to destination file
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

