package as3;

public class CashPayment extends Payment
{

	public CashPayment()
	{
		super();
	}

	public CashPayment(double amount, String date)
	{
		super(amount, date);
	}

	@Override
	public String toString()
	{
		return "CashPayment [getAmount()=" + getAmount() + ", getDate()=" + getDate() + "]";
	}

}
