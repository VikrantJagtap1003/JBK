package Hibernate.Queries.EmployeeQueries;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Hibernate.Entity.Employee;
import Hibernate.configure.ConfigurationData;

public class updatingEmplyeeData {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory=ConfigurationData.configuration();	
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee emp1=new Employee(1,"rushi","pandit","tester", Date.valueOf("2000-12-09"),15000);
		
		session.update(emp1);
		transaction.commit();
	}

}
