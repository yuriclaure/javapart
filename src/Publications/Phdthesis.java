package Publications;

import java.io.OutputStream;
import java.util.List;
import org.jdom2.Element;
import Contributors.Author;

public class Phdthesis extends Publication {
	private List<Author> author;
	private String title;
	private String school;
	private int year;

	public Phdthesis(Element phdthesis) {
		title = phdthesis.getAttributeValue("title");
		List<Element> authorList = phdthesis.getChildren("editor");
		for (Element i : authorList)
			author.add(new Author(i.getChildText("name"), i.getChildText("e-mail")));
		school = phdthesis.getChildText("school");
		year = Integer.parseInt(phdthesis.getChildText("year"));
	}

	@Override
	public void printXML(OutputStream out) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}
}