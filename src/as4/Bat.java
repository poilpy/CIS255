package as4;

public class Bat extends Mammal implements Flyable
{
	private int avgSpeed;

	public Bat(String name, int avgSpeed)
	{
		super(name);
		this.avgSpeed = avgSpeed;
	}

	@Override
	public double getFlightSpeed()
	{
		return avgSpeed;
	}

	@Override
	public String toString()
	{
		return "Bat";
	}

}
