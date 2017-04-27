public class Person
{
	private String name;
	private final static String DEFAULT_NAME = "N/A";

	public Person()
	{
		this(DEFAULT_NAME);
	}

	public Person(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return "Name: " + name;
	}

	public boolean equals(Object obj)
	{
		if (obj instanceof Person)
		{
			Person otherPerson = (Person) obj;
			return name.equalsIgnoreCase(otherPerson.getName());
		} else
		{
			return false;
		}
	}
}
