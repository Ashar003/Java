import javax.swing.*;

public class Lab5Program1 {

	public static void main(String[] args) {
		
	
		String[] wordArray = new String[100];
        String isOrIsNot, inputWord;
        int myArrayLength;
        String myFile = "lab5input.txt";
         myArrayLength = inputFromFile (myFile, wordArray);


               

        while( true ){ //while statement
            
            
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			// This line asks the user for input by popping out a single window
			// with text input
		if(inputWord.equals("STOP")){ //The "STOP" keyword.
			System.exit(0);
		}
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray, myArrayLength)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}//main
    }


    private static int inputFromFile(String filename, String[] wordArray ){
      TextFileInput in = new TextFileInput(filename);
      int lengthFilled = 0;
      String line = in.readLine();
      while ( lengthFilled < wordArray.length && line != null ) {
         wordArray[lengthFilled++] = line;
         line = in.readLine();
      } // while 
      if ( line != null ) {
         System.out.println("File contains too many numbers.");
         System.out.println("This program can process only " +
                            wordArray.length + " numbers.");
         System.exit(1);
      } // if
      in.close();
      return lengthFilled; 
   }  // method inputFromFile 
    
    
			
		

//
/*
string a = "hello"
if ( a== "hello") *CANNOT DO IN JAVA*

string b = "hello";
if(b.equals("hello")) *CAN DO!*

string c= "goodbye";
if(b.equals(0)) ...

*/



	public static boolean wordIsThere(String findMe, String[] theList, int numb) {
		for(int x = 0; x<numb; x++){
			if( theList[x].equals(findMe)){
				return true;
	} // wordIsThere
} // class Lab4Program1
	return false;
	}
}




