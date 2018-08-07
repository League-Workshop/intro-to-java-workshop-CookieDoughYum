package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot dv=new Robot();
	dv.setSpeed(50);
	dv.setPenColor(Color.blue);
	dv.penDown();
	for(int i=0; i<4; i++) {
	dv.move(100);
	dv.turn(90);
}

		
	}
}
