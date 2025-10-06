/** Tevya 22178991 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadNumberFile4New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "./txtFiles/Exercise1/numbers6.txt";
		try {
			File myFile = new File(fileName);
			Scanner inputFile = new Scanner(myFile);
			
			while (inputFile.hasNext()) {
				String str = inputFile.nextLine();
				System.out.println(str);
			}
			inputFile.close();
		} catch (IOException e) {
			System.out.println("Error with File");
		}
	}

}
