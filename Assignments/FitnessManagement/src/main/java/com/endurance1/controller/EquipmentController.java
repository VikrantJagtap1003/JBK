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

import com.endurance1.entity.EquipmentRegistration;
import com.endurance1.entity.StaffRegistration;
import com.endurance1.service.EquipmentService;
import com.endurance1.service.StaffService;

@RequestMapping("/equipment")
public class EquipmentController {

	@Autowired
	EquipmentService equipmentService;

	// Author:Vikrant Jagtap this API is used to get the specific equipment details
	// by using its id(primary key)

	@GetMapping("/getEquipmentById/{equipmentid}")
	public EquipmentRegistration getByEquipmentId(@PathVariable int equipmentid) {
		return equipmentService.getByEquipmentId(equipmentid);
	}

	// Author:Vikrant Jagtap this API is used to get the all equipment details
	@GetMapping("getlist")
	public List<EquipmentRegistration> getlist() {
		return equipmentService.getlist();
	}

	// Author:Vikrant Jagtap this API is used to get the specific equipment details
	// by using equipment name
	@GetMapping("/getByName/{name}")
	public List<EquipmentRegistration> getByName(@PathVariable String name) {
		return equipmentService.getByName(name);
	}

	// Author:Vikrant Jagtap this API is used to add equipment
	@PostMapping("/add")
	public String addEquipment(@RequestBody EquipmentRegistration er) {
		return equipmentService.addEquipment(er);

	}

	// Author:Vikrant Jagtap this API is used to get the specific equipments details
	// by using its type(cardio,muscle,tricep,bicep)
	@GetMapping("getByType/{type}")
	public List<EquipmentRegistration> getByType(@PathVariable String type) {
		return equipmentService.getByType(type);
	}

	// Author:Vikrant Jagtap this API is used to get the specific equipments details
	// by using its status (under maintenance, in use)
	@GetMapping("/ByStatus/{status}")
	public List<EquipmentRegistration> ByStatus(@PathVariable String status) {
		return equipmentService.ByStatus(status);
	}

	// Author:Vikrant Jagtap this API is used to get the specific equipments details
	// by using its count
	@GetMapping("/getByCount/{count}")
	public List<EquipmentRegistration> getByCount(@PathVariable String count) {
		return equipmentService.getByCount(count);
	}

	// Author:Vikrant Jagtap this API is used to update the existing equipment data
	@PutMapping("update")
	public String updateData(@RequestBody EquipmentRegistration er) {
		return equipmentService.updateData(er);
	}

	// Author:Vikrant Jagtap this API is used to delete specific equipment details
	// by using its id(primary key)
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return equipmentService.deleteData(id);
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered ascending according to equipment id
	@GetMapping("orderAscById")
	public List<EquipmentRegistration> orderAscEquimentById() {
		return equipmentService.orderAscEquimentById();
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered descending according to equipment id
	@GetMapping("/orderDesById")
	public List<EquipmentRegistration> orderDesEquipmentById() {
		return equipmentService.orderDesEquipmentById();
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered ascending according to equipment name
	@GetMapping("orderAscByName")
	public List<EquipmentRegistration> orderAscEquimentByName() {
		return equipmentService.orderAscEquimentByName();
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered descending according to equipment name

	@GetMapping("/orderDesByName")
	public List<EquipmentRegistration> orderDesEquipmentByName() {
		return equipmentService.orderDesEquipmentByName();
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered ascending according to equipment type
	@GetMapping("orderAscByType")
	public List<EquipmentRegistration> orderAscEquimentByType() {
		return equipmentService.orderAscEquimentByType();
	}
	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered descending according to equipment type

	@GetMapping("/orderDesByType")
	public List<EquipmentRegistration> orderDesEquipmentByType() {
		return equipmentService.orderDesEquipmentByType();
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered ascending according to equipment count
	@GetMapping("orderAscByCount")
	public List<EquipmentRegistration> orderAscEquimentByCount() {
		return equipmentService.orderAscEquimentByCount();
	}

	// Author:Vikrant Jagtap this API is used to get the equipment details which are
	// ordered descending according to equipment count
	@GetMapping("/orderDesByCount")
	public List<EquipmentRegistration> orderDesEquipmentByCount() {
		return equipmentService.orderDesEquipmentByCount();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name and type
	@GetMapping("equipmentNameAndType")
	public List<EquipmentRegistration> getEquipmentNameAndType() {
		return equipmentService.getEquipmentNameAndType();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name and status
	@GetMapping("equipmentNameAndStatus")
	public List<EquipmentRegistration> getEquipmentNameAndStatus() {
		return equipmentService.getEquipmentNameAndStatus();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name and
	// purchaseDate
	@GetMapping("equipmentNameAndPurchaseDate")
	public List<EquipmentRegistration> getEquipmentNameAndPurchaseDate() {
		return equipmentService.getEquipmentNameAndPurchaseDate();
	}
	// Author:Vikrant Jagtap this API is used to get only equipment name and count

	@GetMapping("equipmentNameAndCount")
	public List<EquipmentRegistration> getEquipmentNameAndCount() {
		return equipmentService.getEquipmentNameAndCount();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name ,type and
	// count
	@GetMapping("equipmentNameTypeAndCount")
	public List<EquipmentRegistration> getEquipmentNameTypeAndCount() {
		return equipmentService.getEquipmentNameTypeAndCount();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name ,purchase
	// date and count
	@GetMapping("equipmentNamePurchaseDateAndCount")
	public List<EquipmentRegistration> getEquipmentNamePurchaseDateAndCount() {
		return equipmentService.getEquipmentNamePurchaseDateAndCount();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name ,status and
	// count
	@GetMapping("equipmentNameStatusAndCount")
	public List<EquipmentRegistration> getEquipmentNameStatusAndCount() {
		return equipmentService.getEquipmentNameStatusAndCount();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name , type
	// status and count
	@GetMapping("equipmentNameTypeStatusAndCount")
	public List<EquipmentRegistration> getEquipmentNameTypeStatusAndCount() {
		return equipmentService.getEquipmentNameTypeStatusAndCount();
	}

	// Author:Vikrant Jagtap this API is used to get only equipment name ,
	// type,purchase date and count
	@GetMapping("equipmentNameTypePurchaseDateAndCount")
	public List<EquipmentRegistration> getEquipmentNameTypePurchaseDateAndCount() {
		return equipmentService.getEquipmentNameTypePurchaseDateAndCount();
	}

	// Author:Vikrant Jagtap this API is used to check if equipment name starts with
	// specific letter or string
	@GetMapping("equipmentNameStartsWith/{startWith}")
	public List<EquipmentRegistration> equipmentNameStartsWith(@PathVariable String startWith) {
		return equipmentService.equipmentNameStartsWith(startWith);
	}

	// Author:Vikrant Jagtap this API is used to check if equipment name ends with
	// specific letter or string
	@GetMapping("equipmentNameEndsWith/{EndWith}")
	public List<EquipmentRegistration> equipmentNameEndsWith(@PathVariable String endWith) {
		return equipmentService.equipmentNameStartsWith(endWith);
	}

	// Author:Vikrant Jagtap this API is used to check if equipment type starts with
	// specific letter or string
	@GetMapping("equipmentTypeStartsWith/{startWith}")
	public List<EquipmentRegistration> equipmentTypeStartsWith(@PathVariable String startWith) {
		return equipmentService.equipmentTypeStartsWith(startWith);
	}

	// Author:Vikrant Jagtap this API is used to check if equipment type ends with
	// specific letter or string
	@GetMapping("equipmentTypeEndsWith/{EndWith}")
	public List<EquipmentRegistration> equipmentTypeEndsWith(@PathVariable String endWith) {
		return equipmentService.equipmentTypeEndsWith(endWith);
	}

	// Author:Vikrant Jagtap this API is used to get all equipment of specific count
	@GetMapping("allEquipmentWithCount/{count}")
	public List<EquipmentRegistration> allEquipmentWithCount(@PathVariable int count) {
		return equipmentService.allEquipmentWithCount(count);
	}

	// Author:Vikrant Jagtap this API is used to get the equipments details above
	// specific purchase date
	@GetMapping("equipmentAboveSpecificPurchaseDate/{date}")
	public List<EquipmentRegistration> equipmentAboveSpecificPurchaseDate(@PathVariable int date) {
		return equipmentService.equipmentAboveSpecificPurchaseDate(date);
	}

}
