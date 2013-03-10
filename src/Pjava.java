import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import IO.*;
import Publications.Article;
import java.util.*;
import Types.*;

public class Pjava {

	public static Researcher researcher = new Researcher();
	public static String fileName;

	public static void main(String[] args) {

		SAXBuilder builder = new SAXBuilder();

		try {

			System.out.println("Bem vindo ao gerenciador de publicações.");
			fileName = Console.readString("Digite o nome do arquivo");

			
			File xmlFile = new File(fileName);
			/*
			 * if (!xmlFile.exists()) xmlFile.createNewFile();
			 */

			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();

			loadXML(rootNode);

			System.out.println("<" + fileName + ">");

			if (Menu.mainMenu() == MenuCommand.Print)
				researcher.print(PublicationType.Article);

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}

	public static void loadXML(Element rootNode) {

		List<Element> list = rootNode.getChildren("article");
		for (Element node : list)
			researcher.add(PublicationType.Article, node);

		list = rootNode.getChildren("book");
		for (Element node : list)
			researcher.add(PublicationType.Book, node);

		list = rootNode.getChildren("inbook");
		for (Element node : list)
			researcher.add(PublicationType.Inbook, node);

		list = rootNode.getChildren("inproceedings");
		for (Element node : list)
			researcher.add(PublicationType.Inproceedings, node);

		list = rootNode.getChildren("masterthesis");
		for (Element node : list)
			researcher.add(PublicationType.Masterthesis, node);

		list = rootNode.getChildren("phdthesis");
		for (Element node : list)
			researcher.add(PublicationType.Phdthesis, node);

		list = rootNode.getChildren("proceedings");
		for (Element node : list)
			researcher.add(PublicationType.Proceedings, node);

		list = rootNode.getChildren("techreport");
		for (Element node : list)
			researcher.add(PublicationType.Techreport, node);
	}
}
