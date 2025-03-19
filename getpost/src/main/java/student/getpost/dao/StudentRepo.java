package student.getpost.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import student.getpost.entity.StudentData;

@Repository
public class StudentRepo {

	@Autowired
	SessionFactory sf;
	
	public String createStudent(StudentData student) {
		
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		s.save(student);
		t.commit();
		s.close();
		return "Student created successfully";
		
	}

	public List<StudentData> getAllStudents() {
		Session s= sf.openSession();
		Transaction t= s.beginTransaction();
		Query<StudentData> query= s.createQuery("from StudentData", StudentData.class);
		return query.getResultList();
		
	}

}
