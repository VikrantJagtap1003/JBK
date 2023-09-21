package com.endurance1.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.FilterDefs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endurance1.dao.FitnessDao;
import com.endurance1.entity.MemberRegistration;

@Service
public class FitnessService {

	@Autowired
	FitnessDao fd;

	public List<MemberRegistration> getMember() {
		return fd.getMember();

	}

	public String addMember(MemberRegistration mr) {
		return fd.addMember(mr);
	}

	public MemberRegistration getMemberById(int id) {
		return fd.getMemberById(id);

	}

	public List<MemberRegistration> getByEmail(String email) {
		return fd.getByEmail(email);

	}

	public List<MemberRegistration> getByFirstAndLastName(MemberRegistration memberRegistration) {
		return fd.getByFirstAndLastName(memberRegistration);

	}

	public List<MemberRegistration> getByGender(String gender) {
		return fd.getByGender(gender);

	}

	public List<MemberRegistration> getByMembershipStartingDate(String date) {
		return fd.getByMembershipStartingDate(date);

	}

	public List<MemberRegistration> getByMobileNumber(String mobilenumber) {
		return fd.getByMobileNumber(mobilenumber);

	}

	public List<MemberRegistration> getByAddress(String cityName) {
		return fd.getByAddress(cityName);

	}

	public String updateEmail(MemberRegistration memberRegistration) {

		return fd.updateEmail(memberRegistration);

	}

	public String deleteUser(int id) {
		return fd.deleteUser(id);

	}

	public List<MemberRegistration> sortByMemberId() {
		return fd.sortByMemberId();

	}

	public List<MemberRegistration> sortByFirstName() {
		return fd.sortByFirstName();

	}

	public List<MemberRegistration> sortByMembershipStartDate() {

		return fd.sortByMembershipStartDate();

	}

	public List<MemberRegistration> getOnlyFirstNameAndLastNameWithId() {

		List<MemberRegistration> list = fd.getOnlyFirstNameAndLastNameWithId();

		List<MemberRegistration> firstNameAndLastNameWithIdList = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			firstNameAndLastNameWithIdList.add(tempMr);
		}

		return firstNameAndLastNameWithIdList;
	}

	public List<MemberRegistration> getOnlyFirstNameAndLastNameOtherThan(String firstName) {
		List<MemberRegistration> list = fd.getOnlyFirstNameAndLastNameOtherThan(firstName);
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;

	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndGender() {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndGender();
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setGender(mr.getGender());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;

	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndMobileNumber() {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndMobileNumber();
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setMobile(mr.getMobile());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddress() {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndAddress();
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setAddress(mr.getAddress());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;

	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndEmail() {

		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndEmail();
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setEmail(mr.getEmail());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndMemberShipStartDate() {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndMemberShipStartDate();
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setMembershipStartDate(mr.getMembershipStartDate());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndEmergencyNumber() {
		
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndEmergencyNumber();
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setEmergencycontact(mr.getEmergencycontact());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressWithSpecificCity(String city) {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndAddressWithSpecificCity(city);
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setAddress(mr.getAddress());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressBelowSpecificDate(String date) {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndAddressBelowSpecificDate(date);
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setAddress(mr.getAddress());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressBelowSpecificMemberShipDate(String date) {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndAddressBelowSpecificMemberShipDate(date);
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setAddress(mr.getAddress());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressAboveSpecificDate(String date) {
		List<MemberRegistration> list = fd.getOnlyFirstNameLastNameAndAddressAboveSpecificDate(date);
		List<MemberRegistration> firstNameAndLastNamedata = new ArrayList<>();
		for (MemberRegistration mr : list) {
			MemberRegistration tempMr = new MemberRegistration();
			tempMr.setFirstName(mr.getFirstName());
			tempMr.setLastName(mr.getLastName());
			tempMr.setAddress(mr.getAddress());
			firstNameAndLastNamedata.add(tempMr);
		}

		return firstNameAndLastNamedata;
	}

	public List<MemberRegistration> getAllMaleWithSpecificAddress(String address) {
		List<MemberRegistration> list = fd.getAllMaleWithSpecificAddress(address);
		List<MemberRegistration> data = new ArrayList<>();
		for (MemberRegistration mr : list) {
			if(mr.getGender().equals("Male")||mr.getGender().equals("male"))
			{
				data.add(mr);
			}
		}
		return data;
	}

	public void getDataFirstNameStartWith(String startwith) {
		
		fd.getDataFirstNameStartWith(startwith);
		
	}

	public List<MemberRegistration> getDataFirstNameEndsWith(String endwith) {
		return fd.getDataFirstNameEndsWith(endwith);
		
	}

	public List<MemberRegistration> getDataLastNameStartWith(String startwith) {
		return fd.getDataLastNameStartWith(startwith);
		
	}

	public List<MemberRegistration> getDataLastNameEndsWith(String endwith) {
		return fd.getDataLastNameEndsWith(endwith);
	}
	
	

}
