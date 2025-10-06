import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile4 {
    public static void main(String[] args) {
        // Default filename
        String filename = "numbers6.txt";

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            // Check if file has no data
            if (!scanner.hasNextLine()) {
                System.out.println("File is empty: " + filename);
            } else {
                // Read three values per line (int, String, int)
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    if (!line.isEmpty()) {
                        Scanner lineScanner = new Scanner(line);
                        try {
                            int first = lineScanner.nextInt();   // whole number
                            String word = lineScanner.next();    // string
                            int third = lineScanner.nextInt();   // whole number
                            System.out.println(first + " " + word + " " + third);
                        } catch (Exception e) {
                            System.out.println("Error: Line does not match expected format -> " + line);
                        }
                        lineScanner.close();
                    }
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
        }
    }
}
