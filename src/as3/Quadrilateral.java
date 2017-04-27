package as3;

public class Quadrilateral extends PolyShape
{

	public Quadrilateral(int sideLength1, int sideLength2, int sideLength3, int sideLength4)
	{
		super(sideLength1, sideLength2, sideLength3, sideLength4);
	}

	public String toString()
	{
		String s = "I am a shape with " + this.getNumSides() + " sides of length: ";
		for (int length : this.getSideLengths())
			s += length + " ";
		s += "\nI am a polygon. ";
		s += "\nI am a Quadrilateral. ";
		return s;
	}

}
