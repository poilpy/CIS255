package as3;

public class Rectangle extends Quadrilateral
{

	public Rectangle(int sideLength1, int sideLength2)
	{
		super(sideLength1, sideLength2, sideLength1, sideLength2);
	}

	public int getArea()
	{
		int[] index = this.getSideLengths();
		return index[1] * index[2];
	}

	public String toString()
	{
		String s = "I am a shape with " + this.getNumSides() + " sides of length: ";
		for (int length : this.getSideLengths())
			s += length + " ";
		s += "\nI am a polygon. ";
		s += "\nI am a Quadrilateral. ";
		s += "\nI am a Rectangle. ";
		return s;
	}

	public void drawLine(int length, String s)
	{
		for (int i = 0; i < length; i++)
			System.out.print(s);
	}

	public void drawHollowLine(int length)
	{

		System.out.print("*");
		drawLine(length - 2, " ");
		System.out.print("*");
	}

	public void drawRectangle()
	{
		int height = this.getSideLengths()[0];
		int length = this.getSideLengths()[1];

		drawLine(length, "*");
		System.out.println();
		for (int i = 0; i < height - 2; i++)
		{
			drawHollowLine(length);
			System.out.println();
		}
		drawLine(length, "*");
	}

}
