package as4;

public class Goldfish extends Fish implements Adoptable
{

	public Goldfish(String name)
	{
		super(name);

	}

	@Override
	public String getHomeCareInstructions()
	{
		return "Once we understand the truth about goldfish, "
				+ "we are quick to realize that we need to provide the proper-sized tank for these fish. "
				+ "A 20-gallon tank is about right for one fish, but if you want more than one, "
				+ "you are going to need at least 10 additional gallons per adult fish. "
				+ "Many people are shocked at the thought of a 55-gallon tank for 3-4 goldfish, but that is the minimum that they need. "
				+ "If you really want to see them reach their full potential, they should be in a 90-gallon tank. "
				+ "Remember, these fish get big and they produce a large amount of waste, so they need a large quantity of water. "
				+ "Also remember that these fish can live twenty years or longer, and will soon become a cherished pet if treated properly, "
				+ "so do not skimp in the tank size department.";
	}

	@Override
	public String toString()
	{
		return "Goldfish";
	}

}
