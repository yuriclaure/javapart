import Publications.*;
import Types.*;
import java.util.*;
import org.jdom2.Element;

public class Researcher {

	private List<Article> articles = new LinkedList<Article>();
	private List<Book> books = new LinkedList<Book>();
	private List<Inbook> inbooks = new LinkedList<Inbook>();
	private List<Inproceedings> inproceedings = new LinkedList<Inproceedings>();
	private List<Masterthesis> masterthesis = new LinkedList<Masterthesis>();
	private List<Phdthesis> phdthesis = new LinkedList<Phdthesis>();
	private List<Proceedings> proceedings = new LinkedList<Proceedings>();
	private List<Techreport> techreports = new LinkedList<Techreport>();

	public void add(PublicationType type, Element publication) {
		if (type == PublicationType.Article) {
			articles.add(new Article(publication));
		} else if (type == PublicationType.Book) {
			books.add(new Book(publication));
		} else if (type == PublicationType.Inbook) {
			inbooks.add(new Inbook(publication));
		} else if (type == PublicationType.Inproceedings) {
			inproceedings.add(new Inproceedings(publication));
		} else if (type == PublicationType.Masterthesis) {
			masterthesis.add(new Masterthesis(publication));
		} else if (type == PublicationType.Phdthesis) {
			phdthesis.add(new Phdthesis(publication));
		} else if (type == PublicationType.Proceedings) {
			proceedings.add(new Proceedings(publication));
		} else {
			techreports.add(new Techreport(publication));
		}
	}

	public void print(PublicationType type) {
		if (type == PublicationType.Article) {
			for (Publication p : articles) {
				p.print();
			}
		} else if (type == PublicationType.Book) {
			for (Publication p : books) {
				p.print();
			}
		} else if (type == PublicationType.Inbook) {
			for (Publication p : inbooks) {
				p.print();
			}
		} else if (type == PublicationType.Inproceedings) {
			for (Publication p : inproceedings) {
				p.print();
			}
		} else if (type == PublicationType.Masterthesis) {
			for (Publication p : masterthesis) {
				p.print();
			}
		} else if (type == PublicationType.Phdthesis) {
			for (Publication p : phdthesis) {
				p.print();
			}
		} else if (type == PublicationType.Proceedings) {
			for (Publication p : proceedings) {
				p.print();
			}
		} else {
			for (Publication p : techreports) {
				p.print();
			}
		}
	}

}