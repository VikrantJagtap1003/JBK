package com.endurance1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endurance1.entity.MemberRegistration;
import com.endurance1.entity.StaffRegistration;
import com.endurance1.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	StaffService staffService;
	// Author:Vikrant Jagtap this API is used to get the all staff members details

	public List<StaffRegistration> getStaffList() {
		return staffService.getStaffList();
	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its id(primary key)
	@GetMapping("/getById/{id}")
	public StaffRegistration getStaffById(@PathVariable int id) {
		return staffService.getStaffById(id);
	}

	// Author:Vikrant Jagtap this API is used to add staff member
	@PostMapping("/add")
	public String addStaffMember(@RequestBody StaffRegistration sr) {
		return staffService.addStaffMember(sr);

	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its email
	@GetMapping("getByEmail/{email}")
	public List<StaffRegistration> getByEmail(@PathVariable String email) {
		return staffService.getByEmail(email);
	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its first name and last name
	@GetMapping("/ByFirstAndLastName")
	public List<StaffRegistration> getByFirstAndLastName(@RequestBody StaffRegistration staffRegistration) {
		return staffService.getByFirstAndLastName(staffRegistration);
	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its gender
	@GetMapping("/getByGender/{gender}")
	public List<StaffRegistration> getByGender(@PathVariable String gender) {
		return staffService.getByGender(gender);
	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its hire date
	@GetMapping("/getByHireDate/{date}")
	public List<StaffRegistration> getByHireDate(@PathVariable String date) {
		return staffService.getByHireDate(date);
	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its mobile number
	@GetMapping("/getByMobileNumber/{mobilenumber}")
	public List<StaffRegistration> getByMobileNumber(@PathVariable String mobilenumber) {
		return staffService.getByMobileNumber(mobilenumber);
	}

	// Author:Vikrant Jagtap this API is used to get the specific staff member
	// details
	// by using its city name(address)
	@GetMapping("/getByAddress/{cityName}")
	public List<StaffRegistration> getByAddress(@PathVariable String cityName) {
		return staffService.getByAddress(cityName);
	}

	// Author:Vikrant Jagtap this API is used to get update specific staff member
	// details
	@PutMapping("update")
	public String updateData(@RequestBody StaffRegistration sf) {
		return ((StaffService) staffService).updateData(sf);
	}

	// Author:Vikrant Jagtap this API is used to delete the specific staff member
	// details
	// by using its id
	@DeleteMapping("/delete/{id}")
	public String deletestaffUser(@PathVariable int id) {
		return staffService.deletestaffUser(id);
	}

	// Author:Vikrant Jagtap this API is used to order staff details in ascending
	// order of their id
	@GetMapping("sortById")
	public List<StaffRegistration> sortByStaffMemberId() {
		return staffService.sortByStaffMemberId();
	}
	// Author:Vikrant Jagtap this API is used to order staff details in ascending
	// order of their First name

	@GetMapping("/orderByFirstName")
	public List<StaffRegistration> sortByFirstName() {
		return staffService.sortByFirstName();
	}
	// Author:Vikrant Jagtap this API is used to order staff details in ascending
	// order of their hire date

	@GetMapping("/orderByHireDate")
	public List<StaffRegistration> sortByHireDate() {
		return staffService.sortByHireDate();
	}
	// Author:Vikrant Jagtap this API is used to get the specific member details by
	// their position

	@GetMapping("/byPosition/{position}")
	public List<StaffRegistration> getByPosition(@PathVariable String position) {
		return staffService.getByPosition(position);
	}
	// Author:Vikrant Jagtap this API is used to order staff details in ascending
	// order of their salary

	@GetMapping("sortBySalary")
	public List<StaffRegistration> sortBySalary() {
		return staffService.sortBySalary();
	}

	// Author:Vikrant Jagtap this API is used to count total salary of staff
	@GetMapping("/totalSalaryOfSatff")
	public List<StaffRegistration> totalSalaryOfStaff() {
		return staffService.totalSalaryOfStaff();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// of staff members

	@GetMapping("getFirstNameAndLastName")
	public List<StaffRegistration> getFirstNameAndLastName() {
		return staffService.getFirstNameAndLastName();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// of specific staff members

	@GetMapping("getFirstNameLastNameById/{id}")
	public List<StaffRegistration> getFirstNameLastNameById(@PathVariable int id) {
		return staffService.getFirstNameLastNameById(id);
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and gender of staff members

	@GetMapping("getFirstNameLastNameAndGender")
	public List<StaffRegistration> getFirstNameLastNameAndGender() {
		return staffService.getFirstNameLastNameAndGender();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and mobile number of staff members

	@GetMapping("getFirstNameLastNameAndMobileNumber")
	public List<StaffRegistration> getFirstNameLastNameAndMobileNumber() {
		return staffService.getFirstNameLastNameAndMobileNumber();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and address of staff members

	@GetMapping("getFirstNameLastNameAndAddress")

	public List<StaffRegistration> getFirstNameLastNameAndAddress() {
		return staffService.getFirstNameLastNameAndAddress();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and address and city of staff members

	@GetMapping("getFirstNameLastNameAndAddressByCity/{city}")
	public List<StaffRegistration> getFirstNameLastNameAndAddressByCity(@PathVariable String city) {
		return staffService.getFirstNameLastNameAndAddressByCity(city);
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and email of staff members

	@GetMapping("getFirstNameLastNameAndEmail")
	public void getFirstNameLastNameAndEmail() {
		staffService.getFirstNameLastNameAndEmail();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and hire date of staff members

	@GetMapping("getFirstNameLastNameAndHireDate")
	public List<StaffRegistration> getFirstNameLastNameAndHireDate() {
		return staffService.getFirstNameLastNameAndHireDate();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and salary of staff members

	@GetMapping("getFirstNameLastNameAndSalary")
	public List<StaffRegistration> getFirstNameLastNameAndSalary() {
		return staffService.getFirstNameLastNameAndSalary();
	}
	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and address of staff members
	// above specific hire date

	@GetMapping("getFirstNameLastNameAndAddressAboveSpecificHireDate/{date}")
	public List<StaffRegistration> getFirstNameLastNameAndAddressAboveSpecificHireDate(@PathVariable String date) {
		return staffService.getFirstNameLastNameAndAddressAboveSpecificHireDate(date);
	}

	// Author:Vikrant Jagtap this API is used to get only first name and last name
	// and address of staff members
	// below specific hire date
	@GetMapping("getFirstNameLastNameAndAddressBelowSpecificHireDate/{date}")
	public List<StaffRegistration> getFirstNameLastNameAndAddressBelowSpecificHireDate(@PathVariable String date) {
		return staffService.getFirstNameLastNameAndAddressBelowSpecificHireDate(date);
	}

	// Author:Vikrant Jagtap this API is used to get only males with specific
	// city(address) only
	@GetMapping("getAllMaleWithSpecificAddress/{address}")
	public void getAllMaleWithSpecificAddress(@PathVariable String address) {
		staffService.getAllMaleWithSpecificAddress(address);
	}

	// Author:Vikrant Jagtap this API is used to get the data if first name starts
	// with
	// specific letter or string
	@GetMapping("getDataFirstNameStartWith/{startwith}")
	public List<StaffRegistration> getDataFirstNameStartWith(@PathVariable String startwith) {
		return staffService.getDataFirstNameStartWith(startwith);
	}

	// Author:Vikrant Jagtap this API is used to get the data if first name ends
	// with
	// specific letter or string
	@GetMapping("getDataFirstNameEndsWith/{endwith}")
	public List<MemberRegistration> getDataFirstNameEndsWith(@PathVariable String endwith) {
		return staffService.getDataFirstNameEndsWith(endwith);
	}

	// Author:Vikrant Jagtap this API is used to get the data if last name starts
	// with
	// specific letter or string
	@GetMapping("getDataLastNameStartWith/{startwith}")
	public List<MemberRegistration> getDataLastNameStartWith(@PathVariable String startwith) {
		return staffService.getDataLastNameStartWith(startwith);
	}

	// Author:Vikrant Jagtap this API is used to get the data if last name ends with
	// specific letter or string
	@GetMapping("getDataLastNameEndsWith/{endwith}")
	public List<MemberRegistration> getDataLastNameEndsWith(@PathVariable String endwith) {
		return staffService.getDataLastNameEndsWith(endwith);
	}

}
