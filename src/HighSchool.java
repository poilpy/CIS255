
public class HighSchool extends School implements Comparable<HighSchool>
{
	private boolean priv;
	private int numGrades;

	public HighSchool(String name, boolean priv, int numGrades)
	{
		super(name);
		this.priv = priv;
		this.numGrades = numGrades;
	}

	public boolean isPriv()
	{
		return priv;
	}

	public void setPriv(boolean priv)
	{
		this.priv = priv;
	}

	public int getNumGrades()
	{
		return numGrades;
	}

	public void setNumGrades(int numGrades)
	{
		this.numGrades = numGrades;
	}

	@Override
	public String toString()
	{
		if (priv)
			return super.toString() + " (" + numGrades + " grades, private)";
		else
			return super.toString() + " (" + numGrades + " grades)";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof HighSchool)
		{
			HighSchool o = (HighSchool) obj;
			return this.getName().equalsIgnoreCase(o.getName()) && this.getNumGrades() == o.getNumGrades()
					&& this.isPriv() == o.isPriv();
		} else
			return false;
	}

	@Override
	public int compareTo(HighSchool o)
	{
		if (this.getName().compareTo(o.getName()) > 0)
		{
			return 1;
		} else if (this.getName().equalsIgnoreCase(o.getName()))
		{
			if (this.getNumGrades() > o.getNumGrades())
			{
				return 1;
			} else if (this.getNumGrades() == o.getNumGrades())
			{
				return 0;
			} else
			{
				return -1;
			}

		} else
			return -1;
	}

	public static void main(String[] argv)
	{
		int count = 0;

		School[] s = new School[] { new School("n1"), new School("n2"), new HighSchool("n3", true, 4),
				new HighSchool("n4", false, 4) };

		for (int i = 0; i < s.length; i++)
			System.out.println(s[i] + " ");

		for (int i = 0; i < s.length; i++)
		{
			if (s[i] instanceof HighSchool)
			{
				HighSchool t = (HighSchool) s[i];
				if (t.isPriv())
					count++;
			}
		}

	}

}
