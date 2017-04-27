public class Invoice
{
	private String invoiceID;
	private double amountDue;

	public Invoice(String invoiceID, double amountDue)
	{
		this.invoiceID = invoiceID;
		this.amountDue = amountDue;
	}

	public String getInvoiceID()
	{
		return invoiceID;
	}

	public double getAmountDue()
	{
		return amountDue;
	}
}