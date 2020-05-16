package csci3444.inheritance;

public abstract class PersonBaseImpl implements Person {
	private String name;
	public PersonBaseImpl(String _name) {
		this.name = _name;
	}
	public String getName() {
		return this.name;
	}
}
