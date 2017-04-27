package as3;

public class Square extends Rectangle
{

	public Square(int sideLength1)
	{
		super(sideLength1, sideLength1);
	}

	public int getArea()
	{
		return super.getArea();
	}

	public String toString()
	{
		String s = "I am a shape with " + this.getNumSides() + " sides of length: ";
		for (int length : this.getSideLengths())
			s += length + " ";
		s += "\nI am a polygon. ";
		s += "\nI am a Quadrilateral. ";
		s += "\nI am a Rectangle. ";
		s += "\nI am a Square. ";
		return s;
	}

}
