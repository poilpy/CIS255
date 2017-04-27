
public class TitledPerson extends Person
{

	private String title;

	public TitledPerson()
	{
		super();
	}

	public TitledPerson(String name, String title)
	{
		super(name);
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	@Override
	public String toString()
	{
		return "Name: " + this.getTitle() + " " + this.getName();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof TitledPerson)
		{
			TitledPerson otherPerson = (TitledPerson) obj;
			return title.equalsIgnoreCase(otherPerson.getTitle()) && super.equals(otherPerson);
		} else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		int count = 0;

		Person[] p = new Person[] { new Person("Bill"), new Person("Ted"), new Person("Cindy"),
				new TitledPerson("Ben", "Mr"), new TitledPerson("Phil", "Dr") };

		for (int i = 0; i < p.length; i++)
			System.out.println(p[i] + " ");

		for (int i = 0; i < p.length; i++)
		{
			if (p[i] instanceof TitledPerson)
			{
				TitledPerson t = (TitledPerson) p[i];
				if (t.getTitle() == "Dr")
					count++;
			}
		}

		System.out.println("Doctors: " + count);

	}
}
