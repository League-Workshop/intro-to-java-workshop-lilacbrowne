package day3;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class SlaveTortoise {
	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			String shape = JOptionPane.showInputDialog("What do you want the tortoise to draw?");
			if (shape.equalsIgnoreCase("circle")) {
				draw(360, 1);
			} else if (shape.equals("triangle")) {
				draw(3, 12);
			} else if (shape.equals("square")) {
				draw(4, 12);
			} else if (shape.equals("pentagon")) {
				draw(5, 12);
			} else if (shape.equals("hexagon")) {
				draw(6, 12);
			} else if (shape.equals("septagon")) {
				draw(7, 12);
			} else if (shape.equals("octagon")) {
				draw(8, 12);
			} else {

				JOptionPane.showMessageDialog(null, "Shape must have 3-8 sides or be a Circle");
			}
		}
	}

	static void draw(int sides, int length) {
		Tortoise.penUp();
		Tortoise.move(50);
		Tortoise.penDown();
		Tortoise.setPenColor(PenColors.getRandomColor());
		Tortoise.setSpeed(10);
		for (int i = 0; i < sides; i++) {
			Tortoise.move(25);
			Tortoise.turn(360 / sides);
		}

	}
}
