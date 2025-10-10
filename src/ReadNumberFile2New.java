/** Tevya 22178991 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadNumberFile2New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Stores file address */
		String fileName = "./txtFiles/Exercise1/numbers3.txt";
		/** Stores first number */
		int num1 = 0;
		/** Stores second number */
		int num2 = 0;
		
		/** Checks whether file exists*/
		try {
			File myFile = new File(fileName);
			Scanner inputFile = new Scanner(myFile);
			
			/** Reads data from file */
			while (inputFile.hasNext()) {
				/** Reads first number */
				num1 = inputFile.nextInt();
				/** Reads second number */
				num2 = inputFile.nextInt();
				/** Prints line */
				System.out.println(num1 + " " + num2);
			}
			inputFile.close();
			
		/** Throws error when file does not exist */
		} catch (IOException e) {
			System.out.println("Error with File");
		}
	}

}
