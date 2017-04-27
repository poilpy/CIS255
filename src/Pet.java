
public abstract class Pet implements Comparable<Pet>
{
	private String name;
	private int age;

	public Pet(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		if (age > 0)
		{
			this.age = age;
		}
	}

	@Override
	public int compareTo(Pet other)
	{
		int c = ((Pet) other).getAge();

		return this.age - c;
	}

	public String toString()
	{
		String s = "Name: " + name;
		s += "\nAge: " + age;
		return s;
	}

	public abstract void printVetAppointmentReminder();
}