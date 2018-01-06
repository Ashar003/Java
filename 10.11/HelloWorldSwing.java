/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;        

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing1234"); //name of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        JLabel label2 = new JLabel("HEHEHEHEH!");
        frame.getContentPane().add(label); //adding to the pane the label.

        //Display the window.
        frame.pack();
        frame.setVisible(true); //If not enababled Jframe will not be visible
        
    }

    public static void main(String[] args) {
         createAndShowGUI();
    }
        
}
