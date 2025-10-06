import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile1 {
    public static void main(String[] args) {
        // Default filename
        String filename = "numbers.txt";

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            // Check if file has no data
            if (!scanner.hasNextLine()) {
                System.out.println("File is empty: " + filename);
            } else {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    if (!line.isEmpty()) {
                        // Since we assume only whole numbers, parse directly
                        int number = Integer.parseInt(line);
                        System.out.println(number);
                    }
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Error: File contains non-integer data.");
        }
    }
}
