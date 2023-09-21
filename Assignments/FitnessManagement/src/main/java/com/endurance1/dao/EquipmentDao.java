package com.endurance1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.endurance1.entity.EquipmentRegistration;
import com.endurance1.entity.StaffRegistration;

public class EquipmentDao {
	
	@Autowired
	SessionFactory sf;

	public EquipmentRegistration getByEquipmentId(int equipmentid) {
		
		Session session=sf.openSession();
		EquipmentRegistration sRegistration=session.get(EquipmentRegistration.class,equipmentid);
		return sRegistration;		
	}
	
	public List<EquipmentRegistration> getlist() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}

	public List<EquipmentRegistration> getByName(@PathVariable String name) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.eq("equipmentName", name));
		return criteria.list();
		
	}

	public String addEquipment(@RequestBody EquipmentRegistration er) {
		Session session=sf.openSession();
		session.save(er);
		session.beginTransaction().commit();
		return "Data added successfully";

	} 

	
	public List<EquipmentRegistration> getByType(@PathVariable String type) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.eq("equipmentType", type));
		return criteria.list();
	}

	
	public List<EquipmentRegistration> ByStatus(@PathVariable String status) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.eq("currentStatus", status));
		return criteria.list();
	}

	
	public List<EquipmentRegistration> getByCount(@PathVariable String count) {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.eq("equipmentCount", count));
		return criteria.list();
	}

	
	public String updateData(@RequestBody EquipmentRegistration er) {
		Session session=sf.openSession();
		session.update(er);
		session.beginTransaction().commit();
		return "Data updated successfully";
	}

	
	public String deleteData(@PathVariable int id) {
		Session session=sf.openSession();
		session.delete(id);
		session.beginTransaction().commit();
		return "Data deleted successfully";
	}


	public List<EquipmentRegistration> orderAscEquimentById() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.asc("equipmentID"));
		return criteria.list();
	}

	
	public List<EquipmentRegistration> orderDesEquipmentById() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.desc("equipmentID"));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> orderAscEquimentByName() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.asc("equipmentName"));
		return criteria.list();
	}

	
	public List<EquipmentRegistration> orderDesEquipmentByName() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.desc("equipmentName"));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> orderAscEquimentByType() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.asc("equipmentType"));
		return criteria.list();
	}

	
	public List<EquipmentRegistration> orderDesEquipmentByType() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.desc("equipmentType"));
		return criteria.list();
	}
	
	
	public List<EquipmentRegistration> orderAscEquimentByCount() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.asc("equipmentCount"));
		return criteria.list();
	}

	
	public List<EquipmentRegistration>orderDesEquipmentByCount() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add((Criterion) Order.desc("equipmentCount"));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameAndType()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameAndStatus()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameAndPurchaseDate()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameAndCount()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameTypeAndCount()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNamePurchaseDateAndCount()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameStatusAndCount()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameTypeStatusAndCount()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> getEquipmentNameTypePurchaseDateAndCount()
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		return criteria.list();
	}
	
	public List<EquipmentRegistration> equipmentNameStartsWith(@PathVariable String startWith)
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.like("equipmentName", startWith+"%"));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> equipmentNameEndsWith(@PathVariable String endWith)
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.like("equipmentName", "%"+endWith));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> equipmentTypeStartsWith(@PathVariable String startWith)
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.like("equipmentType", startWith+"%"));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> equipmentTypeEndsWith(@PathVariable String endWith)
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.like("equipmentType", "%"+endWith));
		return criteria.list();
	}
	
	
	public List<EquipmentRegistration> allEquipmentWithCount(@PathVariable int count)
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.eq("equipmentCount", count));
		return criteria.list();
	}
	
	public List<EquipmentRegistration> equipmentAboveSpecificPurchaseDate(@PathVariable int date)
	{
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EquipmentRegistration.class);
		criteria.add(Restrictions.eq("purchaseDate", date));
		return criteria.list();
	}
	

}
