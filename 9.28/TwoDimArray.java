import javax.swing.*;

public class TwoDimArray {
	
	public static void main(String[] args) {

		// printArray(myArray);
		// printArrayEven(myArray);
		
		String myFile = args[0];

		 printArray(fillArray(myFile));
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	//theArray.length indicates the number of rows that exist.
	//theArray.length[i].length will return the number of columns in that row.
	private static void display (int num){
		// if(num % 2 == 0){
		// System.out.print(num+"  ");
		// }
		// else{
		// System.out.print("*  ");
		// }
		System.out.print(num + "  ");
	}
	private static void printArrayEven(int[][] theArray){
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	public static int[][] fillArray(String myFile) {
		// TODO: read the numbers from "filename" and insert those numbers in the "numbers" array.
			TextFileInput in = new TextFileInput(myFile);
			String line = in.readLine();
			int row = Integer.parseInt(line);
			line = in.readLine();
			int col = Integer.parseInt(line);
			int[][]newArr=new int[row][col];
			line = in.readLine();

			for(int i = 0; i<newArr.length; i++){
				for(int x = 0; x<newArr[i].length; x++){
					int numInt = Integer.parseInt(line);
				newArr[i][x] = numInt;
				line = in.readLine();
			}
				}


		in.close();
		return newArr;
	}

	}

	// TextFileInput in = new TextFileInput(filename);
	// int lengthFilled = 0;
	// String line = in.readLine();

	// while(lengthFilled<numbers.length&&line!=null)
	// {
	// 			int numInt = Integer.parseInt(line);
	// 			numbers[lengthFilled++] = numInt;
	// 			line = in.readLine();
	// 		}