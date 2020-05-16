package csci3444.inheritance;

public class StudentImpl extends PersonBaseImpl implements Student
{
	private String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		this.takenCourseTitle = _takenCourseTitle;
	}

	@Override
	public String studiesFor()
	{
		return this.takenCourseTitle;
	}
	
	@Override
	public String getDetails()
	{
		return "student";
	}
}
