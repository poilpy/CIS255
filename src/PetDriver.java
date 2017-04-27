
import java.util.Arrays;

public class PetDriver
{

	public static void main(String[] args)
	{

		Pet[] p = new Pet[] { new Cat("n1", 1, true), new Cat("n2", 2, true), new Cat("n3", 3, false),
				new Dog("n4", 4, "b1"), new Dog("n5", 5, "b2"), new Dog("n6", 6, "b3") };

		for (int i = 0; i < p.length; i++)
			System.out.println(p[i] + " ");

		for (int i = 0; i < p.length; i++)
		{
			if (p[i] instanceof Cat)
			{
				Cat t = (Cat) p[i];
				if (!t.isInDoor())
					System.out.println(t);
			}
		}

		Arrays.sort(p);

	}

}
