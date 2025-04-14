package library;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class Main {
	 public static void main(String[] args) {
	        Book book = new Book("The Alchemist", "Paulo Coelho", "B001");
	        Member member = new Member("M001", "Alice Johnson");
	        Transaction transaction = new Transaction(member, book);

	        transaction.displayTransaction();
	    }
}
