package as4;

public class Frog extends Amphibian implements Adoptable
{

	public Frog(String name)
	{
		super(name);

	}

	@Override
	public String getHomeCareInstructions()
	{
		return "Good hygiene is necessary for frogs just like it is for us. "
				+ "Since frogs cannot manipulate the faucets in your home to bathe regularly, "
				+ "as they are prone to do, you must provide suitable bathing facilities in their home."
				+ " Actually a frog will utilize their bath to drink too. "
				+ "All frogs drink through their skin so they need preferably de-chlorinated water "
				+ "available when they feel the need to bathe or drink. They will sit in their 'ponds' and soak, "
				+ "which they usually do at night. "
				+ "The water bowl must be changed every day because they often leave debris behind which is pretty nice "
				+ "of them when you think about it. If the debris is in the bowl and easily discarded, then paper toweling, "
				+ "carpeting or whatever you choose to line the bottom of their tanks with, won't need to be washed "
				+ "or changed as often. Very few frogs are house broken. "
				+ "I personally have never met a frog who was, so their droppings must be removed regularly. "
				+ "Let's face it. You wouldn't want to sit around your house with frog droppings all over. "
				+ "Besides, its healthier for your frog because he could get sick from unsanitary conditions which breed nasty bacteria. "
				+ "Keeping your frog's home simple will make it easier for you to provide a clean healthy environment for which your frog will thank you. "
				+ "Trust me. He will, even if he doesn't actually say so. You will know because he will thrive.";
	}

	@Override
	public String toString()
	{
		return "Frog";
	}

}
