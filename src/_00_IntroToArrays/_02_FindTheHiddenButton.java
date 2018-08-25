package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
		// 1. create an array of JButtons. Don't initialize it the array of JButtons. no initialize
		JButton[] jbuttons = new JButton[9];
		
		// 2 create an integer variable called hiddenButton
		int hiddenButton;
		public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3. Ask the user to enter a positive number and convert it to an int
		String positivevalue = JOptionPane.showInputDialog("Please enter a value");
		int integer = Integer.parseInt(positivevalue);
		//Integer.parseInt(positivevalue);
		
		// 4. Initialize the array of JButtons to be the size of the int created in step
		jbuttons = new JButton[integer];
		
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		
		for (int j = 0; j < integer; j++) {
			jbuttons[j] = new JButton();
			jbuttons[j].addActionListener(this);
			panel.add(jbuttons[j]);
			// jbuttons= new JButton[integer];
		}
		//for (int h = 0; h < 9; h++) {
		//jbuttons[h].addActionListener(this);
		//}
		//for (int k = 0; k < 9; k++) {
		//	panel.add(jbuttons[k]);
		//}
		// 9 add the panel to the window
		window.add(panel);
		
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		// 11. set the JFrame to visible.
		window.setVisible(true);
		
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null,"Here are the instructions. ");
		
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		hiddenButton= new Random().nextInt(integer);
		
		// 14. Set the text of the JButton located at hiddenButton to read "ME"
		jbuttons[hiddenButton].setText("ME");
		//hiddenButton[hiddenbutton];
		
		// 15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		jbuttons[hiddenButton].setText("");
		}

		public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		//if(hiddenButton) {
			//e.getSource()==hiddenButton;}
		//if(e.getSource() == hiddenButton) {
		//if(e.getSource() == buttonClicked){
		//}
		if(e.getSource()== jbuttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null,"You win");
		}
		
		// 18. else tell them to try again
		else {
			JOptionPane.showMessageDialog(null,"Try again");
		}
	}
}
