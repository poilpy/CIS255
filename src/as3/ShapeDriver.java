package as3;

import java.util.Scanner;

public class ShapeDriver
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
		char choice;
		int[] shape;

		while (repeat)
		{
			System.out.println("Enter 'p' to create a polygon\n" + "'q' to create a quadrialteral\n"
					+ "'r' to create a rectangle\n" + "'s' to create a square\n" + "'t' to create a triangle\n"
					+ " or any other character to quit.");

			choice = input.next().charAt(0);

			switch (choice)
			{
			case 'p':
				System.out.println("How many sides?");
				int sides = input.nextInt();
				shape = new int[sides];

				for (int i = 0; i < sides; i++)
				{
					System.out.println("Enter the length of side " + (i + 1));
					shape[i] = input.nextInt();
				}
				PolyShape p = new PolyShape(shape);

				System.out.println(p);
				System.out.println(p.getPerimeter());
				break;
			case 'q':
				shape = new int[4];

				for (int i = 0; i < 4; i++)
				{
					System.out.println("Enter the length of side " + (i + 1));
					shape[i] = input.nextInt();
				}
				Quadrilateral q = new Quadrilateral(shape[0], shape[1], shape[2], shape[3]);

				System.out.println(q);
				System.out.println(q.getPerimeter());
				break;
			case 'r':
				shape = new int[4];

				for (int i = 0; i < 2; i++)
				{
					System.out.println("Enter the length of side " + (i + 1));
					shape[i] = input.nextInt();
				}
				Rectangle r = new Rectangle(shape[0], shape[1]);

				System.out.println(r);
				System.out.println(r.getPerimeter());
				System.out.println(r.getArea());
				r.drawRectangle();
				break;
			case 's':
				shape = new int[4];

				System.out.println("Enter the length of side 1");
				shape[0] = input.nextInt();
				Square s = new Square(shape[0]);

				System.out.println(s);
				System.out.println(s.getPerimeter());
				System.out.println(s.getArea());
				s.drawRectangle();
				break;
			case 't':
				shape = new int[3];

				for (int i = 0; i < 3; i++)
				{
					System.out.println("Enter the length of side " + (i + 1));
					shape[i] = input.nextInt();
				}
				Triangle t = new Triangle(shape[0], shape[1], shape[2]);

				System.out.println(t);
				System.out.println(t.getPerimeter());
				System.out.println(t.isEquilateral());
				System.out.println(t.isIsoceles());
				break;
			default:
				repeat = false;
				break;
			}
		}
	}
}
