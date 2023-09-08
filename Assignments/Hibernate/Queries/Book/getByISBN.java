package Hibernate.Queries.BookQueries;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import Hibernate.Entity.Book;
import Hibernate.configure.ConfigurationData;

public class getByISBN {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();
		
		Session session =sessionFactory.openSession();
		
		Criteria criteria=session.createCriteria(Book.class);

		criteria.add(Restrictions.like("isbn","1458"));
		
		List<Book> list=criteria.list();
		
		System.out.println(list);
		
		
	}
	
	

}
