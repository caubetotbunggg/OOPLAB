import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "largefile.txt"; // Specify a large file path 100 MB
        String outputString = ""; // Initialize an empty String
        final int REPORT_INTERVAL = 100000; 

        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();

            int count = 0; 
            for (byte b : inputBytes) {
                outputString += (char) b; // Using + operator for concatenation
                count++;

                if (count % REPORT_INTERVAL == 0) {
                    System.out.println("Processed " + count + " bytes...");
                }
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken (GarbageCreator): " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
