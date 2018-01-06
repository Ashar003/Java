import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;

public class Lab12GUI {

	static TextFileInput inFileName = "lab12.txt";
	static JFrame myFrame;
	static Container cPane;
	static TextArea even, odd;
	
	public Lab12GUI() {
		initialize();
	}
	
	public void initialize() {
		even = new TextArea();
		odd = new TextArea();
		myFrame = new JFrame();
		myFrame.setSize(400, 400);
		myFrame.setLocation(200, 200);
		myFrame.setTitle("");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1, 2)); // 1 row, 2 columns
		cPane = myFrame.getContentPane();
		cPane.add(even);
		cPane.add(odd);

	}
	
	public void main(String[] args) {
		initialize();
		readNumbersFromFile(inFileName);

	}

	public void readNumbersFromFile(String fileName) {
		/*
		 * Add code to this method so... - the two text areas are added to the
		 * content pane of the JFrame (see the code in the PowerPoint on GUIs) -
		 * numbers are read from the file, and even numbers are put in the
		 * TextArea "even", odd numbers in "odd". - At end of file, the JFrame
		 * is made visible.
		 */
		inFile = new TextFileInput(fileName);

		String line;
		line = inFile.readLine();
		while (line != null) {
			int n = Integer.parseInt(line);
			if (n % 2 == 0) {
				even.append(n + "\n");
			} else {
				odd.append(n + "\n");
			}
			line = inFile.readLine();
		} // while

		myFrame.setVisible(true);
	} // readSSNsFromFile

}
