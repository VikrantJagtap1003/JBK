package Hibernate.Queries.BookQueries;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.Entity.Book;
import Hibernate.configure.ConfigurationData;

public class DeleteBook {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();
		
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Book book1=new Book();
		book1.setAuthor("Smith");
		book1.setTitle("Swimming");
		book1.setDate(Date.valueOf("2020-3-31"));
		book1.setIsbn("2356");
		
		session.delete(book1);
		transaction.commit();
		
		
	}
	
	 

}
