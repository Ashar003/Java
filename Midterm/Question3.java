import javax.swing.*;

import jdk.nashorn.internal.runtime.Undefined;

public class Question3 {
    public static void main(String[] args){
        
        String input = JOptionPane.showInputDialog(null, " Enter something!");
        int count = 0;
        while(input.toLowerCase() != "STOP"){

            for(int i = 0; i<input.length(); i++){
                if(input == null || input.charAt(i) != 0){
                    count++;
                }
        JOptionPane.showMessageDialog(null, "There are" + count + "characters");
            }
        }
    }
}