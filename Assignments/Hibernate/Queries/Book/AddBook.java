package Hibernate.Queries.BookQueries;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.Entity.Book;
import Hibernate.configure.ConfigurationData;

public class AddBook {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();
		
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Book book1=new Book();
		book1.setAuthor("jones");
		book1.setTitle("cricket");
		book1.setDate(Date.valueOf("2022-8-15"));
		book1.setIsbn("2658");
		
		session.saveOrUpdate(book1);
		transaction.commit();
		
		
	}
	
	

}
