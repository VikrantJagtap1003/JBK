package Hibernate.Queries.BookQueries;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Hibernate.Entity.Book;
import Hibernate.configure.ConfigurationData;

public class SearchBookByDateRange {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();
		
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Book.class);

		criteria.add(Restrictions.gt("date",Date.valueOf("2015-1-1")));
		criteria.add(Restrictions.lt("date",Date.valueOf("2022-1-1")));
		
		List<Book> list=criteria.list();
		
		System.out.println(list);
		
		
	}
	
	

}
