package day1;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaCode {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.moveTo(100, 500);
		r2d2.penDown();
		r2d2.setPenColor(Color.CYAN);
		r2d2.sparkle();
		r2d2.setSpeed(20);
		for (int i = 0; i < 360; i++) {
			r2d2.move(1);
			r2d2.turn(360 / 360);

		}
	}

	/*
	 * r2d2.penDown(); r2d2.setPenColor(Color.pink); r2d2.sparkle(); r2d2.move(400); r2d2.turn(90); r2d2.penDown();
	 * r2d2.setPenColor(Color.cyan); r2d2.sparkle(); r2d2.move(300); r2d2.turn(90); r2d2.penDown();
	 * r2d2.setPenColor(Color.ORANGE); r2d2.move(400); r2d2.turn(90); r2d2.penDown(); r2d2.setPenColor(Color.yellow);
	 * r2d2.sparkle(); r2d2.setSpeed(20);
	 */

}
