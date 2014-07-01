// Factory Pattern
// Bereket Abraham

public abstract class Bookshop {
	Book book;

	public Bookshop () {
		//
	}

	public void edit () {
		System.out.println("Editing for grammar and punctuation.");
	}

	abstract Book printBook (String type);
}