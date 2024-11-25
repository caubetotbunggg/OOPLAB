import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "largefile.txt"; // Specify a large file path
        StringBuilder outputString = new StringBuilder(); // Using StringBuilder
        final int REPORT_INTERVAL = 100000; 

        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
            long startTime = System.currentTimeMillis();

            int count = 0; 
            for (byte b : inputBytes) {
                outputString.append((char) b); // Efficiently appending to StringBuilder
                count++;

                if (count % REPORT_INTERVAL == 0) {
                    System.out.println("Processed " + count + " bytes...");
                }
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Time taken (NoGarbage): " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
