package as4;

public class Dog extends Mammal implements Adoptable
{

	public Dog(String name)
	{
		super(name);

	}

	@Override
	public String getHomeCareInstructions()
	{
		return "Several “dental diets” have been shown to be of benefit in decreasing dental disease. "
				+ "Some employ a specific kibble design and others include a chemical anti-tartar poly-phosphate ingredient."
				+ "Rawhide products and chew treats can be helpful if chewed daily, and some rawhide chews and biscuits contain "
				+ "an anti-tartar ingredient. Palatability is important – chewing every day is the ideal."
				+ "Dogs are carnivores – they chew on bones in the wild. However, AVDC does not recommend cow hooves, "
				+ "dried natural bones or hard nylon products because they are too hard and do not mimic the effect of a dog tearing meat off a carcass. "
				+ "These hard products are associated with broken teeth or damaged gums.";
	}

	@Override
	public String toString()
	{
		return "Dog";
	}

}
