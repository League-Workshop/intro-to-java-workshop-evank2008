package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot sans = new Robot();
	
	void go() {
		// 4. Make the robot move as fast as possible
sans.setSpeed(500);
sans.penDown();
		// 5. Set the pen width to 5
sans.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for(int i=0; i<4; i++)
{
	
			// 7. Set the pen color to random
	for(int h=0; h<4; h++)
	{
		sans.setRandomPenColor();
			sans.turn(90);
	sans.move(-100);}
	sans.turn(-90);
			// 8. Turn the robot 90 degrees to the right
	
}
// 1. Call the drawSquare() method
	drawSquare();	}

	
	void drawSquare() {
		
		/* 3. Fill in the code to draw a square inside the method below. */
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



