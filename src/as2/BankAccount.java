package as2;

public class BankAccount
{
	private String name;
	private String ID;
	private double balance;

	public BankAccount()
	{
		name = null;
		ID = null;
		balance = 0.0;
	}

	public BankAccount(String name, String ID, double balance)
	{
		this.name = name;
		this.ID = ID;
		this.balance = balance;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getID()
	{
		return ID;
	}

	public void setID(String ID)
	{
		this.ID = ID;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		if (balance >= 0)
			this.balance = balance;
		else
			System.out.println("Error: Negative Balance");
	}

	public String toString()
	{
		return "BankAccount [name=" + name + ", ID=" + ID + ", balance=" + balance + "]";
	}

	public void deposit(double in)
	{
		if (in >= 0)
			balance += in;
		else
			System.out.println("Error: Negative");
	}

	public void withdrawl(double out)
	{
		if (balance - out >= 0 && out >= 0)
			balance -= out;
		else
			System.out.println("Error: Negative");
	}

}
