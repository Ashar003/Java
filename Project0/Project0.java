import javax.swing.*;

public class Project0 {

    public static void main(String[] args){

        // Declaration of one variable.
        String inputWord; 
        //int lowerE;
        //int upperE;

        while(true){ //Will keep runnning as long the user doesn't enter "stop".
            inputWord = JOptionPane.showInputDialog(null, "Please enter a sentence.");
                
            if(inputWord.equalsIgnoreCase("Stop")){ //The "Stop" keyword.
			        System.exit(0); //exit program.
            }

            // I refactored the code; I have the function called within the showMessageDialog.
            // lowerE = countLowerEs(inputWord);
            // upperE = countUpperEs(inputWord);

            JOptionPane.showMessageDialog(null, "Number of lower case e's:" + countLowerEs(inputWord) +"\n"+
            "Number of upper case e's:" + countUpperEs(inputWord));
        }  //inputWord is the parameter passed in to methods within the message dialog.
    };

    
    //Two private classes,which return a int.

    private static int countLowerEs(String Es){ 
        int LowerE = 0; //Count of e's start from 0. 
        for (int i = 0; i < Es.length(); i++) { //Length of the string is obtained by calling the '.length'.
            if (Es.charAt(i) == 'e'){ //Single quotes for strings & double equals to test equality.
                ++LowerE; //Pre-increment.
        }
    }
    return LowerE;   
};


    private static int countUpperEs(String Es){ 
        int UpperE = 0; //Count of e's start from 0. 
        for (int i = 0; i < Es.length(); i++) {
            if (Es.charAt(i) == 'E'){ //Single quotes for strings & using the string method 'charAt' on the string.
                ++UpperE;
            }
        }
        return UpperE; 
    };

};


/*
 Akash Sharma 
 Lab: 11C: Monday & Wednesday 1:40 - 2:30 PM in SB A135B
 */

