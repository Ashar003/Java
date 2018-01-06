import javax.swing.*;

public class Lab6Program1 {

	public static void main(String[] args) {

		// STEP 1: Creating an integer array
		int[] numArray = new int[100];
			// change String[] array into int[] array
		String myFile = args[0];

		int myArrayLength = inputFromFile(myFile, numArray);
			// inputFromFile method will fill numArray with numbers from an
			// external text file, then return how much of my array has been filled

		// STEP 2: Calculating & Displaying Sum
		int sumOfArray = sum(numArray, myArrayLength);
		JOptionPane.showMessageDialog(null, "Sum: " + sumOfArray);

		// STEP 3: Calculating & Displaying Average
		JOptionPane.showMessageDialog(null, "Average: " + average(numArray, myArrayLength));

	}

	private static int inputFromFile(String filename, int[] numbers) {
			
		// TODO: read the numbers from "filename" and insert those numbers in the "numbers" array.
			TextFileInput in = new TextFileInput(filename);
			int lengthFilled = 0;	
			String line = in.readLine();

			while ( lengthFilled < numbers.length && line != null) {
				int numInt = Integer.parseInt(line);
				numbers[lengthFilled++] = numInt;
				line = in.readLine();
			}

		
		if (line != null) { // if array out of bounds, then program will terminate abnormally
			System.out.println("File contains too many numbers.");
			System.out.println("This program can process only " + numbers.length + " numbers.");
			System.exit(1);
			//exit(0) -> Normal termination
			//exit(1) -> Abnormal Termination
		}

		in.close();
		return lengthFilled;
	}
	
	// STEP 2
	public static int sum(int[] myArray, int myArraySize) {
		int arraySum = 0;
		for(int x=0; x< myArraySize; x++){
			arraySum= arraySum + myArray[x];
		}
		// TODO: Find the sum of the elements in the array.
		return arraySum;
	}

	// STEP 3
	public static int average(int[] myArray, int myArraySize) {
		// int arraySum = 0;
		// 	for (int x = 0; x < myArraySize; x++) {
		// 	arraySum = arraySum + myArray[x];
		// }
		int sumOfArray = sum(myArray, myArraySize);
		// return arraySum / myArraySize;
		return sumOfArray / myArraySize;
		// TODO: Find the average of the elments in the array.
		// Hint: Call the "sum" method to retrieve the sum of the elements in the array.
	}

}
