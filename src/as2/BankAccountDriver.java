package as2;

public class BankAccountDriver
{
	public static void main(String[] args)
	{
		BankAccount ac2 = new BankAccount("P1", "000001", 0.0);

		System.out.println(ac2.getName());
		ac2.deposit(200.0);
		System.out.println(ac2.getID());
		ac2.deposit(-2);
		System.out.println(ac2.getBalance());
		ac2.withdrawl(100);
		ac2.setName("P2");
		ac2.withdrawl(200);
		System.out.println(ac2);

	}

}
