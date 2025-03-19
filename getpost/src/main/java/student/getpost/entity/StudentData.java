package student.getpost.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	
	public String name;
	public String department;
	
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentData(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
}
