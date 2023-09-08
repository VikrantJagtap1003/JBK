package Hibernate.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String fName;
	private String lName;
	private String department;
	private Date dateOfBirth;
	private double salary;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fName=" + fName + ", lName=" + lName + ", department="
				+ department + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
	}
	public Employee(int employeeId, String fName, String lName, String department, Date dateOfBirth, double salary) {
		super();
		this.employeeId = employeeId;
		this.fName = fName;
		this.lName = lName;
		this.department = department;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
