package com.endurance1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StaffRegistration {
	@Id
	private int StaffID;
	private String FirstName;
	private String LastName;
	private String DateofBirth;
	private String Gender;
	private String Mobile;
	private String Email;
	private String Address;
	private String Position;
	private String HireDate;
	private double Salary;

	public int getStaffID() {
		return StaffID;
	}

	public void setStaffID(int staffID) {
		StaffID = staffID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getHireDate() {
		return HireDate;
	}

	public void setHireDate(String hireDate) {
		HireDate = hireDate;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "StaffRegistration [StaffID=" + StaffID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateofBirth=" + DateofBirth + ", Gender=" + Gender + ", Mobile=" + Mobile + ", Email=" + Email
				+ ", Address=" + Address + ", Position=" + Position + ", HireDate=" + HireDate + ", Salary=" + Salary
				+ "]";
	}

	public StaffRegistration(int staffID, String firstName, String lastName, String dateofBirth, String gender,
			String mobile, String email, String address, String position, String hireDate, double salary) {
		super();
		StaffID = staffID;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		Gender = gender;
		Mobile = mobile;
		Email = email;
		Address = address;
		Position = position;
		HireDate = hireDate;
		Salary = salary;
	}

	public StaffRegistration() {
		super();
	}

}
