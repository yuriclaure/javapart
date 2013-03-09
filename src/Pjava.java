import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Pjava {
	public static void main(String[] args) {

		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("example.xml");

		try {

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List<Element> list = rootNode.getChildren("article");

			for (Element node : list) {

				System.out.println("title : " + node.getAttributeValue("title"));
				System.out.println("author(s) :");
				List<Element> list2 = node.getChildren("author");
				for (Element hode : list2) {
					System.out.println("\tname: " + hode.getChildText("name"));
					System.out.println("\te-mail: " + hode.getChildText("e-mail"));
				}
				System.out.println("journal : " + node.getChildText("journal"));
				System.out.println("year : " + node.getChildText("year"));

			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}
}
