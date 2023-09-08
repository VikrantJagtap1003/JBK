package Hibernate.Queries.EmployeeQueries;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.Entity.Employee;
import Hibernate.configure.ConfigurationData;

public class GettingEmployeeById {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();	
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Employee emp1=session.get(Employee.class,1);
		transaction.commit();
		
		System.out.println(emp1);
	}

}
