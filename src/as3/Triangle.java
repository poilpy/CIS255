package as3;

public class Triangle extends PolyShape
{

	public Triangle(int sideLength1, int sideLength2, int sideLength3)
	{
		super(sideLength1, sideLength2, sideLength3);
	}

	public boolean isIsoceles()
	{
		int[] sides = this.getSideLengths();

		return sides[0] == sides[1] || sides[1] == sides[2] || sides[2] == sides[0];
	}

	public boolean isEquilateral()
	{
		int[] sides = this.getSideLengths();

		return sides[0] == sides[1] && sides[1] == sides[2];
	}

	public String toString()
	{
		String s = "I am a shape with " + this.getNumSides() + " sides of length: ";
		for (int length : this.getSideLengths())
			s += length + " ";
		s += "\nI am a polygon. ";
		s += "\nI am a Triangle.";
		return s;
	}

}
