
public class ItemPair <P>
{
	private P p1;
	private P p2;

	public ItemPair(P p1, P p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		
	}

	public P getP1()
	{
		return p1;
	}

	public void setP1(P p1)
	{
		this.p1 = p1;
	}

	public P getP2()
	{
		return p2;
	}

	public void setP2(P p2)
	{
		this.p2 = p2;
	}
	
	public boolean equals()
	{
		return this.p1 == this.p2;
	}

}
