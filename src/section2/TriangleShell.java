package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot AD= new Robot();
	
	void go() { // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
AD.setSpeed(999);
		// 4. make a variable to hold the length of the triangle and set it to 50
int tlength=50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for(int i=0; i<60; i++) {
			// 9. Change the color of the pen to a random color
	AD.setRandomPenColor();
			// 8. Increase the length variable by 10
	tlength=60;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(tlength);
			// 10. Turn the robot 6 degrees to the right
	AD.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		for(int i=0; i<3; i++) {
	AD.penDown();
	AD.move(length);
	AD.turn(360/3);
		}		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
