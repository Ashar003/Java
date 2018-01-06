import javax.swing.*;

public class Lab4Program1 {

	public static void main(String[] args) {
		
	
		String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		String isOrIsNot, inputWord;

		while( true ){ //while statement
		

		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			// This line asks the user for input by popping out a single window
			// with text input
		if(inputWord.equals("STOP")){ //The "STOP" keyword.
			System.exit(0);
		}
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}//main
	}
			
		

//
/*
string a = "hello"
if ( a== "hello") *CANNOT DO IN JAVA*

string b = "hello";
if(b.equals("hello")) *CAN DO!*

string c= "goodbye";
if(b.equals(0)) ...

*/



	public static boolean wordIsThere(String findMe, String[] theList) {
		for(int x = 0; x<theList.length; x++){
			if( theList[x].equals(findMe)){
				return true;
	} // wordIsThere
} // class Lab4Program1
	return false;
	}
}

	
