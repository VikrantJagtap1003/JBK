package com.endurance1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MemberRegistration {

	@Id
	private int MemberID;
	private String FirstName;
	private String LastName;
	private String DateofBirth;
	private String Gender;
	private String Mobile;
	private String Email;
	private String Address; 
	private String MembershipStartDate;
	private String emergencycontact;
	
	public int getMemberID() {
		return MemberID;
	}

	public void setMemberID(int memberID) {
		MemberID = memberID;
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

	public String getMembershipStartDate() {
		return MembershipStartDate;
	}

	public void setMembershipStartDate(String membershipStartDate) {
		MembershipStartDate = membershipStartDate;
	}

	public String getEmergencycontact() {
		return emergencycontact;
	}

	public void setEmergencycontact(String emergencycontact) {
		this.emergencycontact = emergencycontact;
	}

	public MemberRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberRegistration(int memberID, String firstName, String lastName, String dateofBirth, String gender,
			String mobile, String email, String address, String membershipStartDate, String emergencycontact) {
		super();
		MemberID = memberID;
		FirstName = firstName;
		LastName = lastName;
		DateofBirth = dateofBirth;
		Gender = gender;
		Mobile = mobile;
		Email = email;
		Address = address;
		MembershipStartDate = membershipStartDate;
		this.emergencycontact = emergencycontact;
	}

	@Override
	public String toString() {
		return "MemberRegistration [MemberID=" + MemberID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", DateofBirth=" + DateofBirth + ", Gender=" + Gender + ", Mobile=" + Mobile + ", Email=" + Email
				+ ", Address=" + Address + ", MembershipStartDate=" + MembershipStartDate + ", emergencycontact="
				+ emergencycontact + "]";
	}

}
