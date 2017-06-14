package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hi" + name);
		String how = JOptionPane.showInputDialog("How has your day been?");
		JOptionPane.showMessageDialog(null, "That's great");
		String color = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, "I like that color too!");
		String age = JOptionPane.showInputDialog("How old are you?");
		JOptionPane.showMessageDialog(null, "That's so cool! I am 14 as well!");

	}
}
