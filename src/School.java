
public class School
{
	private String name;

	public School()
	{
		this.name = "UNKNOWN";
	}

	public School(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Name: " + name;
	}

}
