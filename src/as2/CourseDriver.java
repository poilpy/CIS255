package as2;

public class CourseDriver
{

	public static void main(String[] args)
	{

		Student[] studentsInSchool = new Student[7];
		studentsInSchool[0] = new Student("Adam", "Ant", "S925", true);
		studentsInSchool[1] = new Student("Bob", "Barker", "S713", false);
		studentsInSchool[2] = new Student("Chevy", "Chase", "S512", true);
		studentsInSchool[3] = new Student("Doris", "Day", "S513", true);
		studentsInSchool[4] = new Student("Emilio", "Estevez", "S516", false);
		studentsInSchool[5] = new Student("Farrah", "Fawcet", "S956", true);
		studentsInSchool[6] = new Student("Greta", "Garbo", "S419", true);

		Course course = new Course("Media Studies", 5);

		/*
		 * note: to test the extra credit, replace the line above with the line
		 * below. the rest of the program should run exactly the same.
		 * 
		 * CourseAL course = new CourseAL("Media Studies", 5);
		 * 
		 */

		System.out.println("******Testing toString: should print name, max enrollment, "
				+ "and a message that the roster is empty.*****");
		System.out.println(course);

		System.out.println("******Testing add method: should add Adam, Chevy, Doris, Farrah, and Greta. "
				+ "Should not add Bob or Emilio.*****");
		for (int i = 0; i < studentsInSchool.length; i++)
		{
			Student currentStudent = studentsInSchool[i];
			if (course.addStudent(currentStudent))
			{
				System.out.println(currentStudent + " added.");
			} else
			{
				System.out.println(currentStudent + " was not added.");
			}
		}
		System.out.println();

		System.out.println("******Testing toString and add methods: should print name, max enrollment, "
				+ "number enrolled, and the roster.*****");
		System.out.println(course);

		System.out.println("******Testing drop and toString methods: no changes should be made when "
				+ " trying to drop a student not in the course");
		course.dropStudent(studentsInSchool[4]);
		System.out.println(course);

		System.out.println("******Testing drop and toString methods: Chevy should be dropped");
		course.dropStudent(studentsInSchool[2]);
		System.out.println(course);

		System.out.println("******Testing add, drop, and toString methods: Bob should now be added "
				+ " because he paid tuition and now there is room");
		studentsInSchool[1].setTuitionPaid(true);
		course.addStudent(studentsInSchool[1]);
		System.out.println(course);

	}

}
