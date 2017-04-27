package as3;

public class Payment
{
	private double amount;
	private String date;

	public Payment()
	{
		this.amount = 0.0;
	}

	public Payment(double amount, String date)
	{
		this.amount = amount;
		this.date = date;
	}

	public double getAmount()
	{
		return amount;
	}

	public void setAmount(double amount)
	{
		if (amount >= 0)
			this.amount = amount;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	@Override
	public String toString()
	{
		return "Payment [amount=" + amount + ", date=" + date + "]";
	}

}
