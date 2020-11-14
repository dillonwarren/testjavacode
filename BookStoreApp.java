package bookstore;

public class BookStoreApp {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "The Alchemist";
		book1.author = "Paulo Coelho";
		book1.pubDate = 1988;
		book1.price = 10.19;
		
		Book book2 = new Book();
		book2.title = "As a Man Thinketh";
		book2.author = "james Allen";
		book2.pubDate = 1902;
		book2.price = 5.99;
		
		book1.displayInfo();
		book2.displayInfo();

	}

}
