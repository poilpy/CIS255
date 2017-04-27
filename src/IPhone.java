
public class IPhone extends Phone
{
	private String version;

	public IPhone(String name, double price, boolean btEnabled, String version)
	{
		super(name, price, btEnabled);
		this.version = version;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	@Override
	public String toString()
	{
		return "IPhone [version=" + version + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof IPhone)
		{
			IPhone o = (IPhone) obj;
			return this.getVersion().equalsIgnoreCase(o.getVersion()) && super.equals(obj);
		} else
			return false;
	}

	public static void main(String[] argv)
	{

	}

}
