package Contributors;

public class Author {

	public String name;
	public String email;

	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "\t\t- Nome: "+name + "\n\t\t- E-mail: " + email;
	}
}
