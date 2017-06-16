package day5;

import javax.swing.JOptionPane;

public class FlowChart {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Which Candy Should You Eat?");

		String answer = JOptionPane.showInputDialog("Do you like chocolate or candy?");
		if (answer.equals("chocolate"))
			;
		JOptionPane.showMessageDialog(null, "You should be eating chocolate");

	}

}
