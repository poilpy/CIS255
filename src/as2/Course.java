package as2;

public class Course
{
	private String courseName;
	private int size;
	private Student[] courseList;

	public Course(String courseName, int size)
	{
		this.courseName = courseName;
		this.size = size;
		courseList = new Student[size];
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public int getSize()
	{
		return size;
	}

	public Student[] getCourseList()
	{
		return courseList;
	}

	public void setCourseList(Student[] courseList)
	{
		this.courseList = courseList;
		size = courseList.length;
	}

	public boolean addStudent(Student student)
	{
		for (int i = 0; i < size; i++)
		{
			if (student.isTuitionPaid() && courseList[i] == null)
			{
				courseList[i] = student;
				return true;
			}
		}

		return false;
	}

	public boolean dropStudent(Student student)
	{
		for (int i = 0; i < size; i++)
		{
			if (courseList[i] == student)
			{
				courseList[i] = null;
				return true;
			}
		}

		return false;
	}

	public String toString()
	{
		String str = courseName + " (" + size + " student capacity)\n";

		if (courseList[0] == null)
		{
			return str + "--No students enrolled.--\n";
		} else
		{
			str += ("Enrollment: " + courseCount() + "\n");

			for (int i = 0; i < size; i++)
			{
				if (courseList[i] != null)
					str += (courseList[i] + "\n");
			}
			return str;
		}
	}

	public int courseCount()
	{
		int count = 0;

		for (int i = 0; i < size; i++)
		{
			if (courseList[i] != null)
				count++;
		}

		return count;
	}

}
