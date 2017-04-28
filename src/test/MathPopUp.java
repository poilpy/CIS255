import javax.swing.JOptionPane;

public class MathPopUp {

	public static void main(String[] args) {

		boolean runMath = true;

		while (runMath) {

			System.out.println("starting");

			String userString1 = JOptionPane.showInputDialog(null, "Enter the first number:");
			int userNumber1 = Integer.parseInt(userString1);

			String userString2 = JOptionPane.showInputDialog(null, "Enter the second number:");
			int userNumber2 = Integer.parseInt(userString2);

			int sum = userNumber1 + userNumber2;
			int product = userNumber1 * userNumber2;

			JOptionPane.showMessageDialog(null, "The sum is " + sum + " and the product is " + product);

			int userChoice = JOptionPane.showConfirmDialog(null, "Do you want to enter another pair of numbers?");
			if (userChoice == JOptionPane.YES_OPTION) {
				runMath = true;
			} else {
				runMath = false;
			}

			System.out.println("ending");

		}

	}

}
