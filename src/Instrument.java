
public abstract class Instrument
{

	private double price;

	public Instrument(double price)
	{

		this.price = price;

	}

	public double getPrice()
	{

		return price;

	}

	public void setPrice(double price)
	{

		if (price > 0)
		{

			this.price = price;

		}

	}

	public abstract void tune();

}
