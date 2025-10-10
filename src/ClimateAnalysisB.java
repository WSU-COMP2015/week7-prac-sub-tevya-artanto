/** Tevya 22178991 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class ClimateAnalysisB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Stores file address */
		String fileName = "TempChange_1961-2022.txt";

		/** Checks for whether the file exists */
		try {
			File myFile = new File("./txtFiles/Exercise2/" + fileName);
			Scanner inputFile = new Scanner(myFile);
			/** Average temperature change over ten years. */
			float average = 0;
			
			/** Prints formatted table headings. */
			System.out.println("File Processed: " + fileName + "\n");
			System.out.printf("%1$-15s %2$7s %3$10s %n", "Country", "Code", "Avg");
			System.out.printf("%1$-50S %n","----------------------------------");
			
			/** Reads country name, country code and temperature changes from the file. */
			while (inputFile.hasNext()) {
				try {
					/** Reads country name */
					String country = inputFile.next();
					/** Reads country code */
					String code = inputFile.next();
					/** Initialises/resets the sum of current country's temperature */
					float sum = 0;
					/** Stores the number of years where data on temperature change is available for a specific country*/
					int years = 0;
					/** Sums the current country's temperature changes and counts the number of years where the data exists. */
					while (inputFile.hasNextFloat()) {
						sum += inputFile.nextFloat();
						years++;
					}
					/** Calculates average temperature change. */
					average = sum / years;
					/** Prints data for one country (row). */
					System.out.printf("%1$-15S %2$7S %3$10.3f %n", country, code, average);
					
				/** Throws error when data is not in the expected format. */
				} catch (InputMismatchException e) {
					System.out.println("Bad data in file. Please inspect file.");
				}
			}
			inputFile.close();
			
		/** Throws error when file does not exist. */
		} catch (IOException e){
			System.out.println("File not found.");
		}
	}

}
