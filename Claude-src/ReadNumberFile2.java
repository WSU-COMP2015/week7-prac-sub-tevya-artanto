import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumberFile2 {
    public static void main(String[] args) {
        // Define the filename to read
        String filename = "numbers3.txt";

        // Create File object
        File file = new File(filename);

        try {
            // Create Scanner to read from the file
            Scanner fileScanner = new Scanner(file);

            // Check if file is empty
            if (!fileScanner.hasNextLine()) {
                System.out.println("The file " + filename + " is empty.");
            } else {
                System.out.println("Reading number pairs from " + filename + ":");
                System.out.println("----------------------------------------");

                int lineNumber = 0;
                // Read and display each line with two numbers
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine().trim();
                    lineNumber++;

                    // Skip empty lines
                    if (!line.isEmpty()) {
                        try {
                            String[] numbers = line.split("\\s+");

                            if (numbers.length == 2) {
                                int num1 = Integer.parseInt(numbers[0]);
                                int num2 = Integer.parseInt(numbers[1]);
                                System.out.println(num1 + " " + num2);
                            } else if (numbers.length == 1) {
                                System.out.println("Warning: Line " + lineNumber + " has only one number: " + numbers[0]);
                            } else {
                                System.out.println("Warning: Line " + lineNumber + " has " + numbers.length + " numbers (expected 2): " + line);
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Warning: Line " + lineNumber + " contains invalid number format: " + line);
                        }
                    }
                }

                System.out.println("----------------------------------------");
                System.out.println("Finished reading file.");
            }

            // Close the scanner
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
            System.out.println("Please ensure the file exists in the current directory.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

}
