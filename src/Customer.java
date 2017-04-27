import java.util.*;

public class Customer
{
	private String name;
	private ArrayList<Invoice> invoiceList;
	private static int customerCount = 0;

	public Customer(String name)
	{
		this.name = name;
		invoiceList = new ArrayList<Invoice>();
		customerCount++;
	}

	public Customer(String name, Invoice invoice)
	{
		this.name = name;
		invoiceList = new ArrayList<Invoice>();
		invoiceList.add(invoice);
		customerCount++;
	}

	public static int getCustomerCount()
	{
		return customerCount;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public ArrayList<Invoice> getInvoiceList()
	{
		return invoiceList;
	}

	public void setInvoiceList(ArrayList<Invoice> invoiceList)
	{
		this.invoiceList = invoiceList;
	}

	public String toString()
	{
		return "Customer [name=" + name + ", invoiceList=" + invoiceList.size() + "]";
	}

	public double getTotalDue()
	{

		double total = 0;

		for (int i = 0; i < invoiceList.size(); i++)
		{
			total += invoiceList.get(i).getAmountDue();
		}

		return total;
	}

	public void addInvoice(Invoice invoice)
	{
		invoiceList.add(invoice);
	}

}