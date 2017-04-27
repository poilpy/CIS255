
public class Violin extends Instrument implements Breakable
{
	private String wood;

	public Violin(double price, String wood)
	{
		super(price);

		this.wood = wood;
	}

	public String getWood()
	{
		return wood;
	}

	public void setWood(String wood)
	{
		this.wood = wood;
	}

	@Override
	public void tune()
	{
		System.out.println("Sound of violin");
	}

	@Override
	public void careIntructions()
	{
		System.out.println("Tighten your violin bow before playing by gently turning the tension screw.\n "
				+ "Avoid making the bow hairs too taut---the separation between the bow stick and "
				+ "hair should be about the width of a pencil.");
	}
}
