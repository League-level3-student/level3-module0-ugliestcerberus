package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] funtoy = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			funtoy[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int h = 0; h < 5; h++) {
			int l = new Random().nextInt(500);
			funtoy[h].setX(l);
			funtoy[h].setY(550);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		// 6. use a while loop to repeat step 5 until any robot has reached the top of
		// the screen
		boolean isracing = true;
		int winner= -1;
		while (isracing) {
			for (int l = 0; l < 5; l++) {
				int g = new Random().nextInt(50);
				funtoy[l].move(g);
				if (funtoy[l].getY() <= 0) {
					isracing = false;
					winner=l;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, winner);	
		// 8. try different races with different amounts of robots.
		Robot[]funtoy2= new Robot[7];
		int y= new Random(550).nextInt();
		funtoy2[6].show();
		funtoy2[7].show();
		funtoy2[6&7].setX(y);
		funtoy2[6&7].setY(98);
		
		// 9. make the robots race around a circular track.
	for (int l = 0; l < 361; l++) {
		funtoy[l].turn(360);
		funtoy[l].move(10);
	}
	}
}