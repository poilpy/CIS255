package as4;

public class Whale extends Mammal implements WaterLiveable
{

	public Whale(String name)
	{
		super(name);

	}

	@Override
	public boolean canLiveOnLand()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return "Whale";
	}

}
