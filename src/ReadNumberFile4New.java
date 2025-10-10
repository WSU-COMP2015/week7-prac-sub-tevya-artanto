/** Tevya 22178991 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadNumberFile4New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Stores file address */
		String fileName = "./txtFiles/Exercise1/numbers6.txt";
		/** Stores first integer */
		int num1 = 0;
		/** Stores string */
		String str = "";
		/** Stores second integer */
		int num2 = 0;
		
		/** Checks whether file exists */
		try {
			File myFile = new File(fileName);
			Scanner inputFile = new Scanner(myFile);
			
			/** Reads data from file */
			while (inputFile.hasNext()) {
				/** Reads first integer */
				num1 = inputFile.nextInt();
				/** Reads string */
				str = inputFile.next();
				/** Reads second integer */
				num2 = inputFile.nextInt();
				/** Prints line */
				System.out.println(num1 + " " + str + " " + num2);
			}
			inputFile.close();
			
		/** Throws error when file does not exist */
		} catch (IOException e) {
			System.out.println("Error with File");
		}
	}

}
