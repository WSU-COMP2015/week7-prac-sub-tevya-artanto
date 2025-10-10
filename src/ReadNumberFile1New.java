/** Tevya 22178991 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadNumberFile1New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Stores file address */
		String fileName = "./txtFiles/Exercise1/numbers.txt";
		/** Stores integer value */
		int data = 0;
		
		/** Checks whether file exists*/
		try {
			File myFile = new File(fileName);
			Scanner inputFile = new Scanner(myFile);
			
			/** Reads data from file */
			while (inputFile.hasNext()) {
				/** Reads integer value */
				data = inputFile.nextInt();
				/** Prints integer value */
				System.out.println(data);
			}
			inputFile.close();
			
		/** Throws error when file does not exist */
		} catch (IOException e) {
			System.out.println("Error with File");
		}
	}

}
