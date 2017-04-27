package as4;

public class Fish extends Animal implements WaterLiveable
{

	public Fish(String name)
	{
		super(name);

	}

	@Override
	public boolean isWarmBlooded()
	{
		return false;
	}

	@Override
	public boolean canLiveOnLand()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return "Fish";
	}

}
