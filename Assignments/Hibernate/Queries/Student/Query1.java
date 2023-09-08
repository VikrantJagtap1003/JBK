package Hibernate.Queries.StudentQueries;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.Entity.Student;
import Hibernate.configure.ConfigurationData;

public class Query1 {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=ConfigurationData.configuration();
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> studentlist=criteria.list();
		
		
		System.out.println(studentlist);
		
	}
}
