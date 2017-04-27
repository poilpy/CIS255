package as1;

import java.util.Scanner;

public class as1
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		double[] rainfall = new double[12];
		boolean repeat = true;
		char choice;

		for (int i = 1; i <= 12; i++)
		{

			System.out.println("Enter the amount of rain for " + getMonth(i) + " :");

			rainfall[i - 1] = input.nextDouble();
		}

		while (repeat)
		{
			System.out.print("Enter 'v' to view the monthly rainfall.\n" + "Enter 't' to find the total rainfall.\n"
					+ "Enter 'a' to find the average monthly rainfall.\n"
					+ "Enter 'm' to find the month with the most rainfall.\n"
					+ "Enter 'l' to find the month with the least rainfall.\n"
					+ "Enter 'u' to update rainfall for a given month.\n" + "Enter any other character to quit.\n");

			choice = input.next().charAt(0);

			switch (choice)
			{
			case 'v':
				print(rainfall);
				break;
			case 't':
				total(rainfall);
				break;
			case 'a':
				average(rainfall);
				break;
			case 'm':
				findMax(rainfall);
				break;
			case 'l':
				findMin(rainfall);
				break;
			case 'u':
				update(rainfall, input);
				break;
			default:
				repeat = false;
				break;
			}
		}

	}

	public static void print(double[] array)
	{
		int length = array.length;

		for (int i = 0; i < length; i++)
		{
			System.out.println(array[i] + " inches");
		}
		System.out.println("");
	}

	public static void total(double[] array)
	{
		int length = array.length;
		double sum = 0.0;

		for (int i = 0; i < length; i++)
		{
			sum += array[i];
		}

		System.out.println(sum);
	}

	public static void average(double[] array)
	{
		int length = array.length;
		double sum = 0.0;

		for (int i = 0; i < length; i++)
		{
			sum += array[i];
		}

		System.out.println(sum / length);
	}

	public static void findMax(double[] array)
	{
		int length = array.length;
		double maxValue = 0;
		int maxMonth = 0;

		for (int i = 0; i < length; i++)
		{
			if (array[i] > maxValue)
			{
				maxValue = array[i];
				maxMonth = i + 1;
			}
		}

		String monthString = getMonth(maxMonth);
		System.out.println(monthString);

	}

	public static void findMin(double[] array)
	{
		int length = array.length;
		double minValue = 1000000000;
		int minMonth = 0;

		for (int i = 0; i < length; i++)
		{
			if (array[i] < minValue)
			{
				minValue = array[i];
				minMonth = i + 1;
			}
		}

		String monthString = getMonth(minMonth);
		System.out.println(monthString);

	}

	public static void update(double[] array, Scanner scan)
	{
		System.out.println("Enter the number of the month to update (1-12): ");

		int month = scan.nextInt();

		String monthString = getMonth(month);

		System.out.println("Enter the new rainfall for " + monthString + " :");

		double val = scan.nextDouble();

		array[month - 1] = val;
	}

	public static String getMonth(int monthNum)
	{

		String monthString = "";
		switch (monthNum)
		{
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		}

		return monthString;
	}

}
