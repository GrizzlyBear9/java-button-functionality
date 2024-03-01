// Swing imports
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

// Abstract Window Toolkit (awt) imports
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Main class (implements the ActionListener interface)
public class Main implements ActionListener {
	
	// Objects (but not instantiated)
	JFrame frame;
	JPanel panel;
	JButton button;
	
	// Window settings
	final int WIDTH = 600;
	final int HEIGHT = 500;
	final String TITLE = "My Window";
	
	public static void main(String[] args) {
		new Main();
	}
	
	// Contructor of the Main class 
	public Main() {
		
		// Invoking the two methods
		createPanel();
		createWindow();
		
		// Set the window to be visible
		frame.setVisible(true);
	}
	
	// Method to create the frame (Window)
	public void createWindow() {
		frame = new JFrame();									// Instantiating the JFrame object
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Exits the program when cicked 'X' button
		frame.setSize(WIDTH, HEIGHT);							// Width and height 0f the frame
		frame.setTitle(TITLE);									// Title of the frame
		frame.setLocationRelativeTo(null);						// Window will be opened in the center of the screen
		frame.setResizable(false);								// Cant resize the window. (If you want it set it to true)
		
		frame.add(panel);										// Adding the panel component to the frame
	}
	
	// Method to create the Panel of the window
	public void createPanel() {
		panel = new JPanel();									// Instantiating the JPanel object
		button = new JButton("Click Me!");						// Instantiating the JButton object
		
		button.setBounds(10, 10, 100, 45);						// Setting the bounds of the button
		button.setFocusable(false);								// Gets rid of that annoying box on the button
		button.addActionListener(this);							// Adding the ActionListener Interface to the button
		
		panel.setLayout(null);									// We dont need a Layout manager so set it to be null
		panel.add(button);										// Add the button component to the panel
	}
	
	// Overriding method of the ActionListener Interface
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Adding some funtionality to the button
		if(e.getSource() == button){
			
			// A popup message using the JOptionPane class
			JOptionPane.showMessageDialog(null, "You clicked me???", "", JOptionPane.PLAIN_MESSAGE);	// 4 arguments (parent component, message, title, message type)
		}
	}
}










