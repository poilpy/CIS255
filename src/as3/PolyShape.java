package as3;

import java.util.Arrays;

public class PolyShape
{
	private int numSides;
	private int[] sideLengths;

	/*
	 * note: PolyShape constructor takes a variable-length parameter list; this
	 * means it can be invoked with any number of integers; inside the
	 * constructor, sideLengths is treated as an int[]
	 * 
	 */
	public PolyShape(int... sideLengths)
	{
		this.sideLengths = sideLengths;
		this.numSides = sideLengths.length;
	}

	public int getNumSides()
	{
		return numSides;
	}

	public int[] getSideLengths()
	{
		return Arrays.copyOf(sideLengths, sideLengths.length);
	}

	public int getPerimeter()
	{
		int perim = 0;
		for (int n : sideLengths)
			perim += n;
		return perim;
	}

	public String toString()
	{
		String s = "I am a shape with " + numSides + " sides of length: ";
		for (int length : sideLengths)
			s += length + " ";
		s += "\nI am a polygon.";
		return s;
	}
}