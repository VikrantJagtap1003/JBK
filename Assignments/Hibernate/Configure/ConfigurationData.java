package Hibernate.configure;
import org.hibernate.cfg.Configuration;

import Hibernate.Entity.Book;
import Hibernate.Entity.Employee;
import Hibernate.Entity.Student;

import org.hibernate.SessionFactory;



public  final class ConfigurationData {
	
	private ConfigurationData()
	{
		
	}
	
	public static SessionFactory configuration()
	{
		Configuration configuration=new Configuration();
        configuration.configure("Hibernate/Hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        return sessionFactory;	
	}

}
