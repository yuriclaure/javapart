package Publications;

import org.jdom2.Element;
import java.io.OutputStream;
import java.util.*;

import Contributors.*;

public class Article extends Publication {
	private String title;
	private List<Author> author = new LinkedList<Author>();
	private String journal;
	private int year;
	private int volume;
	private int number;
	private String pages;

	public Article(Element article) {
		title = article.getAttributeValue("title");
		List<Element> authorList = article.getChildren("author");
		for (Element node : authorList)
			author.add(new Author(node.getChildText("name"), node.getChildText("e-mail")));

		journal = article.getChildText("journal");
		year = Integer.parseInt(article.getChildText("year"));

	}

	@Override
	public void printXML(OutputStream out) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println("- Título: " + title);
		System.out.println("\t- Autores: ");
		for (Author a : author)
			System.out.println(a.toString());
		System.out.println("\t- Revista: " + journal);
		System.out.println("\t- Ano: " + year);

	}

}
