package Publications;

import java.io.OutputStream;
import java.util.List;
import Contributors.Author;
import org.jdom2.Element;

public class Techreport extends Publication {

	private List<Author> author;
	private String title;
	private String institution;
	private int year;
	private int number;

	public Techreport(Element techreport) {
		title = techreport.getAttributeValue("title");
		List<Element> authorList = techreport.getChildren("author");
		for (Element i : authorList)
			author.add(new Author(i.getChildText("name"), i.getChildText("e-mail")));

		institution = techreport.getChildText("institution");
		year = Integer.parseInt(techreport.getChildText("year"));
		number = Integer.parseInt(techreport.getChildText("number"));

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