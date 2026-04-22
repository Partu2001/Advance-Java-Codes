package hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	int salary;
	
	public EmployeeTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeTable(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeTable [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	 
	
	

}
