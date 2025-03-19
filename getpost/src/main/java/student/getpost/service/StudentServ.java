package student.getpost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.getpost.dao.StudentRepo;
import student.getpost.entity.StudentData;

@Service
public class StudentServ {
	
	@Autowired
	StudentRepo studentrepo;

	public String createStudent(StudentData student) {
		studentrepo.createStudent(student);
		return "Student added successfully";
		
	}

	public List<StudentData> getAllStudents() {
		
		return studentrepo.getAllStudents();
	}

}
