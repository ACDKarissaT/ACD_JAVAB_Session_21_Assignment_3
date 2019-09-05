package a20_3;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentClient {
	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		factory = new Configuration().configure().buildSessionFactory();
		
		Student student = new Student();
		student.setStud_name("StudentName");
		student.setStud_marks(1);
		student.setStud_join_date(new Date(System.currentTimeMillis()));
		Session session = factory.getCurrentSession();
		
		Transaction tnx = session.beginTransaction();
		Integer idInserted = (Integer) session.save(student);
		System.out.println("ID inserted is " + idInserted);
		tnx.commit();
		
		session.close();
	}

}
