/** Tevya 22178991 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadNumberFile1New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "./txtFiles/Exercise1/numbers1.txt";
		try {
			File myFile = new File(fileName);
			Scanner inputFile = new Scanner(myFile);
			
			while (inputFile.hasNext()) {
				int data = inputFile.nextInt();
				System.out.println(data);
			}
			inputFile.close();
		} catch (IOException e) {
			System.out.println("Error with File");
		}
	}

}
