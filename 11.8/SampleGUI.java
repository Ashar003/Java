import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {
      
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
        createFileMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } //SSNGUI

   private void createFileMenu( ) {
      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("BANANAS"); //OPtion at the top of gui
      JMenu editMenu = new JMenu("DOODLE"); //Option at the top of the gui
      FileMenuHandler fmh  = new FileMenuHandler(this);
      EditMenuHandler emh = new EditMenuHandler(this);

      item = new JMenuItem("OpenNNNN");    //Open option under File...
      item.addActionListener( fmh ); //Listener from FIleMenuHandler.Java
      fileMenu.add( item ); //add this "item" (OPTION "OPEN") to the JMENU "file"

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit option under File
      item.addActionListener( fmh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu); //add the fileMenu to the menuBar

      //EDIT

      item = new JMenuItem("Find");
      item.addActionListener( emh );
      editMenu.add( item );
      //SO THIS creates a new option in the jMENU  called " FIND"

      editMenu.addSeparator(); //SEPERATOR

        item = new JMenuItem("Replace");
        item.addActionListener( emh );
        editMenu.add(item);

        setJMenuBar(menuBar);
        menuBar.add(editMenu); //add the editMenu to the menuBar

    

    
   } //createMenu

} //SSNGUI
