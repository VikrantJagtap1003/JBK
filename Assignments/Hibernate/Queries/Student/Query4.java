package Hibernate.Queries.StudentQueries;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Hibernate.Entity.Student;
import Hibernate.configure.ConfigurationData;

public class Query4 {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=ConfigurationData.configuration();
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Student.class);
		
		criteria.setProjection(Projections.avg("studentAge"));
		List<Student> studentlist=criteria.list();
		
		System.out.println(studentlist);
		
	}
}
