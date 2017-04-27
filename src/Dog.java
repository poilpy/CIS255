
public class Dog extends Pet
{
	private String breed;

	public Dog(String name, int age, String breed)
	{
		super(name, age);
		this.breed = breed;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	@Override
	public String toString()
	{
		return "Dog [name=" + this.getName() + ", age=" + this.getAge() + ", breed=" + this.getBreed() + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Dog)
		{
			Dog o = (Dog) obj;
			return this.getName().equalsIgnoreCase(o.getName()) && this.getBreed().equalsIgnoreCase(o.getBreed())
					&& Math.abs(this.getAge() - o.getAge()) < 0.01;
		} else
			return false;
	}

	public void printVetAppointmentReminder()
	{

	}

}
