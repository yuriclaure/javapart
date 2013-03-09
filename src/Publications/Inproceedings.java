package Publications;

import java.io.OutputStream;
import java.util.List;
import org.jdom2.Element;
import Contributors.Author;
import Contributors.Editor;

public class Inproceedings extends Publication {
	private List<Author> author;
	private String title;
	private String booktitle;
	private int year;
	private List<Editor> editor;
	private int volume;
	private String series;
	private String pages;
	private String publisher;

	public Inproceedings(Element inproceedings) {
		List<Element> authorList = inproceedings.getChildren("author");
		for (Element i : authorList)
			author.add(new Author(i.getChildText("name"), i.getChildText("e-mail")));
		title = inproceedings.getAttributeValue("title");
		booktitle = inproceedings.getChildText("booktitle");
		year = Integer.parseInt(inproceedings.getChildText("year"));
		List<Element> editorList = inproceedings.getChildren("editor");
		for (Element i : editorList)
			editor.add(new Editor(i.getChildText("name"), i.getChildText("e-mail")));
		volume = Integer.parseInt(inproceedings.getChildText("volume"));
		pages = inproceedings.getChildText("pages");
		series = inproceedings.getChildText("series");
		publisher = inproceedings.getChildText("publisher");
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