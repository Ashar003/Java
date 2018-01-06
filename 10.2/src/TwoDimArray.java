import java.util.StringTokenizer;

import javax.swing.*;

public class TwoDimArray {
	
	public static void main(String[] args) {

		// printArray(myArray);
		// printArrayEven(myArray);
		
		String myFile = args[0];

		 printArray(fillArray(myFile));
		// System.out.println(fillArray(myFile));
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
			//Creating a instance/object 'in' from the clas TextFileInput

			String line = in.readLine(); //This reads the line-->
			//"4,6"
			StringTokenizer st = new StringTokenizer(line,",");


			int row = Integer.parseInt(st.nextToken());
			//create a integer name row which is made an ainteger after being parsed by the 'st.nextToken' method
			//** st.nextToken reads the multiple types on a line. nextToken means to go to the next type on the line.. so "4" to "6"

			// int row = Integer.parseInt(numO);
			
			// String num2 = st.nextToken();
			int col = Integer.parseInt(st.nextToken());

			int[][]newArr = new int[row][col];

			//**SELF-EXPLANATORY */

			// for (int i = 0; i < newArr.length; i++) {
			// for (int x = 0; x < newArr[i].length; x++) {
			// 	line = in.readLine();
				
			// 	String arrNum = st.nextToken();
			// 	int numInt = Integer.parseInt(arrNum);
			// 	newArr[i][x] = numInt;
				
			// }

			for (int i =0; i<row; i++){ //i<4
				line= in.readLine();
				st = new StringTokenizer(line, ",");
				//READS the line(row)

			for(int j =0; j < col; j++){ //i<6
				int numb = Integer.parseInt(st.nextToken());
				//This goes through the line type by type, token by token
				newArr[i][j] = numb ;
			}
			}
		// }

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