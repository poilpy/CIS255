
public class Phone implements Comparable<Phone>
{
	private String name;
	private double price;
	private boolean btEnabled;

	public Phone(String name, double price, boolean btEnabled)
	{
		this.name = name;
		this.price = price;
		this.btEnabled = btEnabled;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public boolean isBtEnabled()
	{
		return btEnabled;
	}

	public void setBtEnabled(boolean btEnabled)
	{
		this.btEnabled = btEnabled;
	}

	@Override
	public String toString()
	{
		return "Phone [name=" + name + ", price=" + price + ", btEnabled=" + btEnabled + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Phone)
		{
			Phone o = (Phone) obj;
			return this.getName().equalsIgnoreCase(o.getName()) && this.isBtEnabled() == o.isBtEnabled()
					&& Math.abs(this.getPrice() - o.getPrice()) < 0.01;
		} else
			return false;
	}

	@Override
	public int compareTo(Phone o)
	{
		if (this.getName().compareTo(o.getName()) > 0)
		{
			return 1;
		} else if (this.getName() == o.getName())
		{
			if (this.getPrice() > o.getPrice())
			{
				return 1;
			} else if (this.getPrice() == o.getPrice())
			{
				return 0;
			} else
			{
				return -1;
			}

		} else
			return -1;
	}
}
