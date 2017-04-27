package as3;

public class CreditPayment extends Payment
{
	private String name;
	private String ccNum;

	public CreditPayment()
	{
		super();
	}

	public CreditPayment(double amount, String date, String name, String ccNum)
	{
		super(amount, date);
		this.name = name;
		this.ccNum = ccNum;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCcNum()
	{
		return ccNum;
	}

	public void setCcNum(String ccNum)
	{
		this.ccNum = ccNum;
	}

	@Override
	public String toString()
	{
		return "CreditPayment [name=" + name + ", ccNum=" + ccNum + ", getAmount()=" + getAmount() + ", getDate()="
				+ getDate() + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof CreditPayment)
		{
			CreditPayment cp = (CreditPayment) obj;
			return name.equalsIgnoreCase(cp.getName()) && ccNum.equalsIgnoreCase(cp.getCcNum())
					&& getDate().equalsIgnoreCase(cp.getDate()) && (getAmount() - cp.getAmount() <= Math.abs(.01));
		} else
		{
			return false;
		}
	}

}
