package Contributors;

public class Editor {

	public String name;
	public String email;

	public Editor(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return name + " " + email;
	}
}
