package Publications;

import java.io.OutputStream;
import java.util.List;
import org.jdom2.Element;
import Contributors.Author;

public class Masterthesis extends Publication {
	private List<Author> author;
	private String title;
	private String school;
	private int year;

	public Masterthesis(Element masterthesis) {
		title = masterthesis.getAttributeValue("title");
		List<Element> authorList = masterthesis.getChildren("editor");
		for (Element i : authorList)
			author.add(new Author(i.getChildText("name"), i.getChildText("e-mail")));
		school = masterthesis.getChildText("school");
		year = Integer.parseInt(masterthesis.getChildText("year"));

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