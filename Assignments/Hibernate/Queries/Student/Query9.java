package Hibernate.Queries.StudentQueries;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import Hibernate.Entity.Student;
import Hibernate.configure.ConfigurationData;

public class Query9 {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=ConfigurationData.configuration();
		Session session =sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Criteria criteria=session.createCriteria(Student.class);
		
		
		ProjectionList projectionList=Projections.projectionList();
		
		projectionList.add(Projections.property("studentAge"));
		projectionList.add(Projections.property("studentName"));
		criteria.setProjection(projectionList);
		List<Student> studentlist=criteria.list();
		Iterator it2 = studentlist.iterator();

	        while (it2.hasNext()) {
	            Object[] obj = (Object[]) it2.next();
	            System.out.println("StudentAge : " + obj[0]+" StudentName: "+obj[1]);
	        }
		
	}
}
