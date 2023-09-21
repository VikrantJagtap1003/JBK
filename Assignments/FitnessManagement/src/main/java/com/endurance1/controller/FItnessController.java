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
import com.endurance1.service.FitnessService;

@RestController
@RequestMapping("/member")
public class FItnessController {

	@Autowired
	FitnessService fs;

	@GetMapping("/getlist")
	public List<MemberRegistration> getMember() {
		return fs.getMember();
	}

	@GetMapping("/")
	public String homePage() {
		return "welcome to homePage";
	}

	@GetMapping("/getById/{id}")
	public MemberRegistration getMemberById(@PathVariable int id) {
		return fs.getMemberById(id);
	}

	@PostMapping("/add")
	public String addMember(@RequestBody MemberRegistration mr) {
		return fs.addMember(mr);

	}

	@GetMapping("getByEmail/{email}")
	public List<MemberRegistration> getByEmail(@PathVariable String email) {
		return fs.getByEmail(email);
	}

	@GetMapping("/ByFirstAndLastName")
	public List<MemberRegistration> getByFirstAndLastName(@RequestBody MemberRegistration memberRegistration) {
		return fs.getByFirstAndLastName(memberRegistration);
	}

	@GetMapping("/getByGender/{gender}")
	public List<MemberRegistration> getByGender(@PathVariable String gender) {
		return fs.getByGender(gender);
	}

	@GetMapping("/getByMembershipDate/{date}")
	public List<MemberRegistration> getByMembershipStartingDate(@PathVariable String date) {
		return fs.getByMembershipStartingDate(date);
	}

	@GetMapping("/getByMobileNumber/{mobilenumber}")
	public List<MemberRegistration> getByMobileNumber(@PathVariable String mobilenumber) {
		return fs.getByMobileNumber(mobilenumber);
	}
	
	@GetMapping("/getByAddress/{cityName}")
	public List<MemberRegistration> getByAddress(@PathVariable String cityName)
	{
		return fs.getByAddress(cityName);
	}
	@PutMapping("update")
	public String updateEmail(@RequestBody MemberRegistration memberRegistration)
	{
		return fs.updateEmail(memberRegistration);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		return fs.deleteUser(id);
	}
	@GetMapping("sortByAge")
	public List<MemberRegistration> sortByMemberId()
	{
		return fs.sortByMemberId();
	}
	@GetMapping("/orderByFirstName")
	public List<MemberRegistration> sortByFirstName()
	{
		return fs.sortByFirstName();
	}
	@GetMapping("/orderByMembershipStartDate")
	public List<MemberRegistration> sortByMembershipStartDate()
	{
		return fs.sortByMembershipStartDate();
	}
	
	@GetMapping("getOnlyFirstNameAndLastNameWithId")
	public List<MemberRegistration> getOnlyFirstNameAndLastNameWithId()
	{
		return fs.getOnlyFirstNameAndLastNameWithId();
	}
	
	@GetMapping("getOnlyFirstNameAndLastNameOtherThan/{firstName}")
	public List<MemberRegistration> getOnlyFirstNameAndLastNameOtherThan(@PathVariable String firstName)
	{
		return fs.getOnlyFirstNameAndLastNameOtherThan(firstName);
	}
	
	@GetMapping("getOnlyFirstNameLastNameAndGender")
	
	public List<MemberRegistration> getOnlyFirstNameLastNameAndGender()
	{
		return fs.getOnlyFirstNameLastNameAndGender();
	}
	
	@GetMapping("getOnlyFirstNameLastNameAndMobileNumber")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndMobileNumber()
	{
		return fs.getOnlyFirstNameLastNameAndMobileNumber();
	}
	
	@GetMapping("getOnlyFirstNameLastNameAndAddress")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddress()
	{
		return fs.getOnlyFirstNameLastNameAndAddress();
	}
	@GetMapping("getOnlyFirstNameLastNameAndAddress/{city}")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressWithSpecificCity(String city)
	{
		return fs.getOnlyFirstNameLastNameAndAddressWithSpecificCity(city);
	}
	
	@GetMapping("getOnlyFirstNameLastNameAndEmail")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndEmail()
	{
		return fs.getOnlyFirstNameLastNameAndEmail();
	}
	
	@GetMapping("getOnlyFirstNameLastNameAndMemberShipStartDate")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndMemberShipStartDate()
	{
		return fs.getOnlyFirstNameLastNameAndMemberShipStartDate();
	}
	@GetMapping("getOnlyFirstNameLastNameAndEmergencyNumber")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndEmergencyNumber()
	{
		return fs.getOnlyFirstNameLastNameAndEmergencyNumber();
	}
	@GetMapping("getOnlyFirstNameLastNameAndAddressBelowSpecificDate/{date}")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressBelowSpecificDate(@PathVariable String date)
	{
		return fs.getOnlyFirstNameLastNameAndAddressBelowSpecificDate(date);
	}
	@GetMapping("getOnlyFirstNameLastNameAndAddressAboveSpecificDate/{date}")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressAboveSpecificDate(@PathVariable String date)
	{
		return fs.getOnlyFirstNameLastNameAndAddressAboveSpecificDate(date);
	}
	@GetMapping("getOnlyFirstNameLastNameAndAddressBelowSpecificMemberShipDate/{date}")
	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressBelowSpecificMemberShipDate(@PathVariable String date)
	{
		return fs.getOnlyFirstNameLastNameAndAddressBelowSpecificMemberShipDate(date);
	}
	
	@GetMapping("getAllMaleWithSpecificAddress/{address}")
	
	public void getAllMaleWithSpecificAddress(@PathVariable String address)
	{
		fs.getAllMaleWithSpecificAddress(address);
	}
	
	@GetMapping("getDataFirstNameStartWith/{startwith}")
	public void getDataFirstNameStartWith(@PathVariable String startwith) {
		fs.getDataFirstNameStartWith(startwith);
	}
	
	@GetMapping("getDataFirstNameEndsWith/{endwith}")
	public List<MemberRegistration> getDataFirstNameEndsWith(@PathVariable String endwith) {
		return fs.getDataFirstNameEndsWith(endwith);
	}
	
	@GetMapping("getDataLastNameStartWith/{startwith}")
	public List<MemberRegistration> getDataLastNameStartWith(@PathVariable String startwith) {
		return fs.getDataLastNameStartWith(startwith);
	}
	
	@GetMapping("getDataLastNameEndsWith/{endwith}")
	public List<MemberRegistration> getDataLastNameEndsWith(@PathVariable String endwith) {
		return fs.getDataLastNameEndsWith(endwith);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
