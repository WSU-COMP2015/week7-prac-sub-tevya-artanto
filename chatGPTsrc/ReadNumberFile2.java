import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile2 {
    public static void main(String[] args) {
        // Default filename
        String filename = "numbers3.txt";

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            // Check if file has no data
            if (!scanner.hasNextLine()) {
                System.out.println("File is empty: " + filename);
            } else {
                // Read two numbers per line
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    if (!line.isEmpty()) {
                        Scanner lineScanner = new Scanner(line);
                        try {
                            // Expecting two integers per line
                            int num1 = lineScanner.nextInt();
                            int num2 = lineScanner.nextInt();
                            System.out.println(num1 + " " + num2);
                        } catch (Exception e) {
                            System.out.println("Error: Line does not contain two integers -> " + line);
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
