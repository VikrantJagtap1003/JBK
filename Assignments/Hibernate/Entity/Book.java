package Hibernate.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book {
	@Id
	private String isbn;
	private String title;
	private String author;
	private  Date date;
	
	public Book(String title, String author, Date date, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", date=" + date + ", isbn=" + isbn + "]";
	}
	public Book() {
		super();
	}
	
	

}
