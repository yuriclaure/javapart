package Publications;

import java.io.OutputStream;
import java.util.List;
import org.jdom2.Element;
import Contributors.Editor;

public class Proceedings extends Publication {

	private String title;
	private int year;
	private List<Editor> editor;
	private int volume;
	private String series;
	private String publisher;

	public Proceedings(Element proceedings) {
		title = proceedings.getAttributeValue("title");
		year = Integer.parseInt(proceedings.getChildText("year"));
		List<Element> editorList = proceedings.getChildren("editor");
		for (Element i : editorList)
			editor.add(new Editor(i.getChildText("name"), i.getChildText("e-mail")));
		volume = Integer.parseInt(proceedings.getChildText("volume"));
		series = proceedings.getChildText("series");
		publisher = proceedings.getChildText("publisher");
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