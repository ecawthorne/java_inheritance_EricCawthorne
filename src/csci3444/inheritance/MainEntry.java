package csci3444.inheritance;

public class MainEntry {

	public static void main(String[] args) {
		Person p1, p2;
		Teacher t;
		t = new TeacherImpl("ilker", "Java");
		Student s = new StudentImpl("Eric", "Java");
		p1 = t;
		p2 = s;
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}
