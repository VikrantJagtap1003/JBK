package com.endurance1.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.endurance1.dao.EquipmentDao;
import com.endurance1.entity.EquipmentRegistration;

public class EquipmentService {
	@Autowired
	EquipmentDao eDao;

	public EquipmentRegistration getByEquipmentId(int equipmentid) {
		return eDao.getByEquipmentId(equipmentid);

	}

	public List<EquipmentRegistration> getlist() {
		return eDao.getlist();
	}

	public List<EquipmentRegistration> getByName(@PathVariable String name) {
		return eDao.getByName(name);
	}

	public String addEquipment(@RequestBody EquipmentRegistration er) {
		return eDao.addEquipment(er);

	}

	public List<EquipmentRegistration> getByType(@PathVariable String type) {
		return eDao.getByType(type);
	}

	public List<EquipmentRegistration> ByStatus(@PathVariable String status) {
		return eDao.ByStatus(status);
	}

	public List<EquipmentRegistration> getByCount(@PathVariable String count) {
		return eDao.getByCount(count);
	}

	public String updateData(@RequestBody EquipmentRegistration er) {
		return eDao.updateData(er);
	}

	public String deleteData(@PathVariable int id) {
		return eDao.deleteData(id);
	}

	public List<EquipmentRegistration> orderAscEquimentById() {
		return eDao.orderAscEquimentById();
	}

	public List<EquipmentRegistration> orderDesEquipmentById() {
		return eDao.orderDesEquipmentById();
	}

	public List<EquipmentRegistration> orderAscEquimentByName() {
		return eDao.orderAscEquimentByName();
	}

	public List<EquipmentRegistration> orderDesEquipmentByName() {
		return eDao.orderDesEquipmentByName();
	}

	public List<EquipmentRegistration> orderAscEquimentByType() {
		return eDao.orderAscEquimentByType();
	}

	public List<EquipmentRegistration> orderDesEquipmentByType() {
		return eDao.orderDesEquipmentByType();
	}

	public List<EquipmentRegistration> orderAscEquimentByCount() {
		return eDao.orderAscEquimentByCount();
	}

	public List<EquipmentRegistration> orderDesEquipmentByCount() {
		return eDao.orderDesEquipmentByCount();
	}

	public List<EquipmentRegistration> getEquipmentNameAndType() {
		
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameAndType();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setEquipmentType(equipmentRegistration.getEquipmentType());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameAndStatus() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameAndStatus();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setCurrentStatus(equipmentRegistration.getCurrentStatus());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameAndPurchaseDate() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameAndPurchaseDate();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setPurchaseDate(equipmentRegistration.getPurchaseDate());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameAndCount() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameAndCount();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setEquipmentCount(equipmentRegistration.getEquipmentCount());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameTypeAndCount() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameTypeAndCount();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setEquipmentType(equipmentRegistration.getEquipmentType());
			 temEquipmentRegistration.setEquipmentCount(equipmentRegistration.getEquipmentCount());
			 temEquipmentRegistration.setEquipmentID(equipmentRegistration.getEquipmentID());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNamePurchaseDateAndCount() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNamePurchaseDateAndCount();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setPurchaseDate(equipmentRegistration.getPurchaseDate());
			 temEquipmentRegistration.setEquipmentCount(equipmentRegistration.getEquipmentCount());
			 temEquipmentRegistration.setEquipmentID(equipmentRegistration.getEquipmentID());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameStatusAndCount() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameStatusAndCount();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setCurrentStatus(equipmentRegistration.getCurrentStatus());
			 temEquipmentRegistration.setEquipmentCount(equipmentRegistration.getEquipmentCount());
			 temEquipmentRegistration.setEquipmentID(equipmentRegistration.getEquipmentID());
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameTypeStatusAndCount() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameTypeStatusAndCount();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setCurrentStatus(equipmentRegistration.getCurrentStatus());
			 temEquipmentRegistration.setEquipmentCount(equipmentRegistration.getEquipmentCount());
			 temEquipmentRegistration.setEquipmentID(equipmentRegistration.getEquipmentID());
			 temEquipmentRegistration.setEquipmentType(equipmentRegistration.getEquipmentType());
			 
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> getEquipmentNameTypePurchaseDateAndCount() {
		List<EquipmentRegistration> returnedList=eDao.getEquipmentNameTypePurchaseDateAndCount();
		List<EquipmentRegistration> dataList=new ArrayList<>();
		for(EquipmentRegistration equipmentRegistration:returnedList)
		{
			 EquipmentRegistration temEquipmentRegistration=new EquipmentRegistration();
			 temEquipmentRegistration.setEquipmentName(equipmentRegistration.getEquipmentName());
			 temEquipmentRegistration.setPurchaseDate(equipmentRegistration.getPurchaseDate());
			 temEquipmentRegistration.setEquipmentCount(equipmentRegistration.getEquipmentCount());
			 temEquipmentRegistration.setEquipmentID(equipmentRegistration.getEquipmentID());
			 temEquipmentRegistration.setEquipmentType(equipmentRegistration.getEquipmentType());
			 
			 dataList.add(temEquipmentRegistration);
		}
		return dataList;
	}

	public List<EquipmentRegistration> equipmentNameStartsWith(@PathVariable String startWith) {
		return eDao.equipmentNameStartsWith(startWith);
	}

	public List<EquipmentRegistration> equipmentNameEndsWith(@PathVariable String endWith) {
		return eDao.equipmentNameStartsWith(endWith);
	}

	public List<EquipmentRegistration> equipmentTypeStartsWith(@PathVariable String startWith) {
		return eDao.equipmentTypeStartsWith(startWith);
	}

	public List<EquipmentRegistration> equipmentTypeEndsWith(@PathVariable String endWith) {
		return eDao.equipmentTypeEndsWith(endWith);
	}

	public List<EquipmentRegistration> allEquipmentWithCount(@PathVariable int count) {
		return eDao.allEquipmentWithCount(count);
	}

	public List<EquipmentRegistration> equipmentAboveSpecificPurchaseDate(@PathVariable int date) {
		return eDao.equipmentAboveSpecificPurchaseDate(date);
	}

}
