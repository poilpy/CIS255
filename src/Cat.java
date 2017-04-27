
public class Cat extends Pet
{
	private boolean inDoor;

	public Cat(String name, int age, boolean inDoor)
	{
		super(name, age);
		this.inDoor = inDoor;
	}

	public boolean isInDoor()
	{
		return inDoor;
	}

	public void setInDoor(boolean inDoor)
	{
		this.inDoor = inDoor;
	}

	@Override
	public String toString()
	{
		return "Cat [name=" + this.getName() + ", age=" + this.getAge() + ", inDoor=" + this.isInDoor() + "]";
	}

	public void printVetAppointmentReminder()
	{

	}

}
