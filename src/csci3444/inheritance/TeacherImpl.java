package csci3444.inheritance;

public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	private String thoughtCourseTitle;

	public TeacherImpl(String _name, String _thoughtCourseTitle) {
		super(_name);
		this.thoughtCourseTitle = _thoughtCourseTitle;
	}

	public String thoughtCourseTitle()
	{
		return this.thoughtCourseTitle;
	}

	@Override
	public String teachesFor()
	{
		return this.thoughtCourseTitle;
	}

	@Override
	public String getDetails()
	{
		return "teacher";
	}
}
