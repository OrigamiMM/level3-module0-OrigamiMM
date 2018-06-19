package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method

	public static void main(String[] args) {
		int x = 50;
		Random r = new Random();
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[7];
		// 3. use a for loop to initialize the robots.
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setY(550);
			rob[i].setX(x);
			rob[i].setSpeed(10);
			x += 100;
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean foundWinner = false;
		while (foundWinner == false) {
			for (int i = 0; i < rob.length; i++) {
				rob[i].move(r.nextInt(50));
				if (rob[i].getY() <= 50) {
					System.out.println("Robot "+ (i+1) + " is the winner!");
					foundWinner = true;
					System.out.flush();
				}
			}
		}
	}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.-

	// 7. declare that robot the winner and throw it a party!-

	// 8. try different races with different amounts of robots.-

	// 9. make the robots race around a circular track.

}
