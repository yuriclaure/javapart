package Publications;

import Contributors.*;

import java.io.OutputStream;
import java.util.*;
import org.jdom2.Element;

public class Inbook extends Publication {

	private List<Author> author;
	private List<Editor> editor;
	private String title;
	private String chapter;
	private String publisher;
	private int year;
	private int volume;
	private String series;
	private String edition;

	public Inbook(Element inbook) {
		List<Element> authorList = inbook.getChildren("author");
		for (Element i : authorList)
			author.add(new Author(i.getChildText("name"), i.getChildText("e-mail")));
		List<Element> editorList = inbook.getChildren("editor");
		for (Element i : editorList)
			editor.add(new Editor(i.getChildText("name"), i.getChildText("e-mail")));
		title = inbook.getAttributeValue("title");
		chapter = inbook.getChildText("chapter");
		publisher = inbook.getChildText("pages");
		year = Integer.parseInt(inbook.getChildText("year"));
		volume = Integer.parseInt(inbook.getChildText("volume"));
		series = inbook.getChildText("series");
		edition = inbook.getChildText("publisher");
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