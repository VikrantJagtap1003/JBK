package Hibernate.Queries.EmployeeQueries;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Hibernate.Entity.Employee;
import Hibernate.configure.ConfigurationData;

public class GettingEmployeeOtherThanTester {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();	
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.ne("department","tester"));
		List<Employee> list1=criteria.list();
		
		System.out.println(list1);
		transaction.commit();
		
	}

}
