package as2;

public class Student
{
	private String firstName;
	private String lastName;
	private String iD;
	private boolean tuitionPaid;

	public Student(String firstName, String lastName, String iD, boolean paidTuition)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.iD = iD;
		this.tuitionPaid = paidTuition;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getiD()
	{
		return iD;
	}

	public void setiD(String iD)
	{
		this.iD = iD;
	}

	public boolean isTuitionPaid()
	{
		return tuitionPaid;
	}

	public void setTuitionPaid(boolean paidTuition)
	{
		this.tuitionPaid = paidTuition;
	}

	public String toString()
	{
		return firstName + " " + lastName + " (" + iD + ")";
	}

}
