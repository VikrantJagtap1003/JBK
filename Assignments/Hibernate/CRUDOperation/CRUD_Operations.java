package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUD_Operations {

    public static void main(String[] args) {

        Configuration configuration=new Configuration();
        configuration.configure("Hibernate/Hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Student student1=new Student();
        student1.setStudentName("vikrant");
        student1.setStudentId(1);
        student1.setStudentAge(23);

//        insert
        session.save(student1);
        transaction.commit();

//        update
        session.update(student1);
        transaction.commit();

//        Read
       Student student2= session.get(Student.class,2);
       System.out.println(student2);


//       delete
       session.delete(student1);
       transaction.commit();

       
        session.close();
    }
}
