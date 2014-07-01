// Factory Pattern
// Bereket Abraham

public class SpanishBookshop {

	public SpanishBookshop () {
		//
	}

	public void edit () {
		System.out.println("Editing for grammar and punctuation.");
	}

	public Book printBook (String type) {
		book = null;

		if (type == "dictionario") {
			book = new Dictionary();
		}
		else if (type == "novela") {
			book = new Novel();
		}

		return book;
	}
}