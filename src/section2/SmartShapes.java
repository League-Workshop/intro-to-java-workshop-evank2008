package section2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot sans = new Robot();

        // 3. Put the robot's pen down
sans.penDown();
sans.hide();
        // 6. Make the robot move as fast as possible
sans.setSpeed(1000);

        // 5. Use a for loop to repeat everything below 4 times. 
for(int i=0; i<360; i++)
{

        //         2. Move your robot 200 pixels
sans.move(2);

        //         4. Turn the robot 90 degrees to the right

    	sans.turn(1);
    	
}

sans.penUp();

sans.turn(90);

sans.move(60);

sans.microTurn(90);

sans.penDown();

sans.turn(90);
//draw left eye
sans.move(60);
    
sans.penUp();
					// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
sans.turn(90);

sans.move(90);

sans.turn(90);

sans.penDown();

sans.move(60);

sans.penUp();

sans.move(45);
    }
}
