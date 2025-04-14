package library.transactions;

import library.books.Book;
import library.members.Member;

import java.util.Date;

public class Transaction {
	private Member member;
    private Book book;
    private Date dateIssued;

    public Transaction(Member member, Book book) {
        this.member = member;
        this.book = book;
        this.dateIssued = new Date(); // current date
    }

    public void displayTransaction() {
        System.out.println("Transaction Info:");
        member.displayMemberInfo();
        book.displayBookInfo();
        System.out.println("Date Issued: " + dateIssued);
    }
}
