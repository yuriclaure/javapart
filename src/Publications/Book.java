package Publications;

import java.io.OutputStream;
import java.util.List;
import org.jdom2.Element;
import Contributors.Author;
import Contributors.Editor;

public class Book extends Publication {

	private List<Author> author;
	private List<Editor> editor;
	private String title;
	private String publisher;
	private int year;
	private int volume;
	private String series;
	private String edition;

	public Book(Element book) {
		List<Element> authorList = book.getChildren("author");
		for (Element i : authorList)
			author.add(new Author(i.getChildText("name"), i.getChildText("e-mail")));
		List<Element> editorList = book.getChildren("editor");
		for (Element i : editorList)
			editor.add(new Editor(i.getChildText("name"), i.getChildText("e-mail")));
		title = book.getAttributeValue("title");
		publisher = book.getChildText("pages");
		year = Integer.parseInt(book.getChildText("year"));
		volume = Integer.parseInt(book.getChildText("volume"));
		series = book.getChildText("series");
		edition = book.getChildText("publisher");
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