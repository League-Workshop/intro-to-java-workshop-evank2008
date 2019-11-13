package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot sans = new Robot();
		sans.setSpeed(100);
		sans.penDown();
		for(int i=0; i<4; i++)
		{
		sans.move(-100);
		sans.turn(90);}
		
		sans.penUp();
		sans.move(100);
		sans.sparkle();
		sans.turn(360);
		sans.unSparkle();
	}
}
