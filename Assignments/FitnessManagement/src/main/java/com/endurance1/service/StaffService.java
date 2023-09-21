package com.endurance1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.endurance1.dao.StaffDao;
import com.endurance1.entity.MemberRegistration;
import com.endurance1.entity.StaffRegistration;

@Service
public class StaffService {

	@Autowired
	StaffDao sDao;

	public List<StaffRegistration> getStaffList() {
		return sDao.getStaffList();

	}

	public StaffRegistration getStaffById(int id) {

		return sDao.getStaffById(id);
	}

	public String addStaffMember(StaffRegistration sr) {
		return sDao.addStaffMember(sr);
	}

	public List<StaffRegistration> getByEmail(String email) {

		return sDao.getByEmail(email);
	}

	public List<StaffRegistration> getByFirstAndLastName(StaffRegistration staffRegistration) {

		return sDao.getByFirstAndLastName(staffRegistration);
	}

	public List<StaffRegistration> getByGender(String gender) {
		return sDao.getByGender(gender);
	}

	public List<StaffRegistration> getByHireDate(String date) {

		return sDao.StaffRegistration(date);
	}

	public List<StaffRegistration> getByMobileNumber(String mobilenumber) {

		return sDao.getByMobileNumber(mobilenumber);
	}

	public List<StaffRegistration> getByAddress(String cityName) {

		return sDao.getByAddress(cityName);
	}

	public String updateData(StaffRegistration sf) {

		return sDao.updateData(sf);
	}

	public String deletestaffUser(int id) {
		return sDao.deletestaffUser(id);
	}

	public List<StaffRegistration> sortByStaffMemberId() {

		return sDao.sortByStaffMemberId();
	}

	public List<StaffRegistration> sortByFirstName() {

		return sDao.sortByFirstName();
	}

	public List<StaffRegistration> sortByHireDate() {

		return sDao.sortByHireDate();
	}

	public List<StaffRegistration> getByPosition(String position) {
		return sDao.getByPosition(position);

	}

	public List<StaffRegistration> sortBySalary() {
		return sDao.sortBySalary();

	}

	public List<StaffRegistration> totalSalaryOfStaff() {
		return sDao.totalSalaryOfStaff();
		
	}

	public List<StaffRegistration> getFirstNameAndLastName() {
		
		List<StaffRegistration> dataList=sDao.getFirstNameAndLastName();
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameById(int id) {
		List<StaffRegistration> dataList=sDao.getFirstNameAndLastName();
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			if(staffRegistration.getStaffID()==id)
			{
				tempRegistration.setFirstName(staffRegistration.getFirstName());
				tempRegistration.setLastName(staffRegistration.getLastName());
				collectedDataList.add(tempRegistration);
			}
			
			
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndGender() {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndGender();	
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setGender(staffRegistration.getGender());
			
			
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndMobileNumber() {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndMobileNumber();
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setMobile(staffRegistration.getMobile());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList; 
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddress() {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndAddress();	
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setAddress(staffRegistration.getAddress());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList; 
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddressByCity(String city) {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndAddressByCity(city);	
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			if(staffRegistration.getAddress().equals("city"))
			{
				tempRegistration.setFirstName(staffRegistration.getFirstName());
				tempRegistration.setLastName(staffRegistration.getLastName());
				tempRegistration.setAddress(staffRegistration.getAddress());
				collectedDataList.add(tempRegistration);
			}
			
			
		}
		return collectedDataList; 
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndEmail() {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndEmail();
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setEmail(staffRegistration.getEmail());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndHireDate() {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndHireDate();
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setHireDate(staffRegistration.getHireDate());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndSalary() {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndSalary();	
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setSalary(staffRegistration.getSalary());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddressAboveSpecificHireDate(String date) {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndAddressAboveSpecificHireDate(date);
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setAddress(staffRegistration.getAddress());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddressBelowSpecificHireDate(String date) {
		List<StaffRegistration> dataList=sDao.getFirstNameLastNameAndAddressBelowSpecificHireDate(date);
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		for(StaffRegistration staffRegistration:dataList)
		{
			StaffRegistration tempRegistration=new StaffRegistration();
			tempRegistration.setFirstName(staffRegistration.getFirstName());
			tempRegistration.setLastName(staffRegistration.getLastName());
			tempRegistration.setAddress(staffRegistration.getAddress());
			collectedDataList.add(tempRegistration);
		}
		return collectedDataList;
	}

	public List<StaffRegistration> getAllMaleWithSpecificAddress(String address) {
		List<StaffRegistration> dataList=sDao.getAllMaleWithSpecificAddress(address);
		List<StaffRegistration> collectedDataList=new ArrayList<>();
		
		for(StaffRegistration staffRegistration:dataList)
		{
			if(staffRegistration.getGender().equals("male")||staffRegistration.getGender().equals("Male"))
			{
				collectedDataList.add(staffRegistration);
			}
		}
		
		return collectedDataList;
		
	}

	public List<StaffRegistration> getDataFirstNameStartWith(String startwith) {
		return sDao.getDataFirstNameStartWith(startwith);
		
	}

	public List<MemberRegistration> getDataFirstNameEndsWith(String endwith) {
		
		return sDao.getDataFirstNameEndsWith(endwith);
	}

	public List<MemberRegistration> getDataLastNameStartWith(String startwith) {
		
		return sDao.getDataLastNameStartWith(startwith);
	}

	public List<MemberRegistration> getDataLastNameEndsWith(String endwith) {
		
		return sDao.getDataLastNameEndsWith(endwith);
	}
	

}
