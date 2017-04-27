package as4;

public abstract class Animal
{
	private String name;

	public Animal(String name)
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
		return "Animal";
	}

	public abstract boolean isWarmBlooded();

}
