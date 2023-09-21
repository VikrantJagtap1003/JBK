package com.endurance1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.endurance1.entity.MemberRegistration;
import com.endurance1.entity.StaffRegistration;

@Repository
public class StaffDao {
	@Autowired
	SessionFactory sFactory;

	public List getStaffList() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);

		return criteria.list();

	}

	public StaffRegistration getStaffById(int id) {
		Session ss = sFactory.openSession();
		return ss.get(StaffRegistration.class, id);
	}

	public String addStaffMember(StaffRegistration sr) {
		Session ss = sFactory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(sr);
		tr.commit();
		ss.close();
		return "Data Saved Successfully..";

	}

	public List<StaffRegistration> getByEmail(String email) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("Email", email));
		return criteria.list();

	}

	public List<StaffRegistration> getByFirstAndLastName(StaffRegistration staffRegistration) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("FirstName", staffRegistration.getFirstName()));
		criteria.add(Restrictions.eq("LastName", staffRegistration.getLastName()));

		return criteria.list();
	}

	public List<StaffRegistration> getByGender(String gender) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("Gender", gender));
		return criteria.list();
	}

	public List<StaffRegistration> StaffRegistration(String date) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("HireDate", date));
		return criteria.list();
	}

	public List<StaffRegistration> getByMobileNumber(String mobilenumber) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("Mobile", mobilenumber));
		return criteria.list();
	}

	public List<StaffRegistration> getByAddress(String cityName) {

		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("Address", cityName));
		return criteria.list();
	}

	public String updateData(StaffRegistration sf) {
		Session ss = sFactory.openSession();
		ss.update(sf);
		ss.beginTransaction().commit();
		ss.close();
		return "Email updated";
	}

	public String deletestaffUser(int id) {
		Session ss = sFactory.openSession();
		ss.delete(id);
		ss.beginTransaction().commit();
		ss.close();
		return "user Deleted successfully";
	}

	public List<StaffRegistration> sortByStaffMemberId() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add((Criterion) Order.asc("MemberID"));
		return criteria.list();
	}

	public List<StaffRegistration> sortByFirstName() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add((Criterion) Order.asc("FirstName"));
		return criteria.list();
	}

	public List<StaffRegistration> sortByHireDate() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add((Criterion) Order.asc("HireDate"));
		return criteria.list();
	}

	public List<StaffRegistration> getByPosition(String position) {

		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.eq("Position", position));
		return criteria.list();
	}

	public List<StaffRegistration> sortBySalary() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add((Criterion) Order.asc("Salary"));
		return criteria.list();

	}

	public List<StaffRegistration> totalSalaryOfStaff() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add((Criterion) Projections.sum("Salary"));
		
		return criteria.list();
		
	}

	public List<StaffRegistration> getFirstNameAndLastName() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
		
	}

	public List<StaffRegistration> getFirstNameLastNameById(int id) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
	}

	public List<StaffRegistration> getFirstNameLastNameAndGender() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
	}

	public List<StaffRegistration> getFirstNameLastNameAndMobileNumber() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddress() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddressByCity(String city) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndEmail() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
		
	}

	public List<StaffRegistration> getFirstNameLastNameAndHireDate() {
		
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
	}

	public List<StaffRegistration> getFirstNameLastNameAndSalary() {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		return criteria.list();
	}

	public List<StaffRegistration> getFirstNameLastNameAndAddressAboveSpecificHireDate(
			String date) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.gt("HireDate", date));
		return criteria.list();
		
	}

	public List<com.endurance1.entity.StaffRegistration> getFirstNameLastNameAndAddressBelowSpecificHireDate(
			String date) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.lt("HireDate", date));
		return criteria.list();
	}

	public List getAllMaleWithSpecificAddress(String address) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.lt("Address", address));
		return criteria.list();
		
	}

	public List<StaffRegistration> getDataFirstNameStartWith(String startwith) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.like("FirstName", startwith+"%"));
		return criteria.list();
		
	}

	public List<MemberRegistration> getDataFirstNameEndsWith(String endwith) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.like("FirstName", "%"+endwith));
		return criteria.list();
	}

	public List<MemberRegistration> getDataLastNameStartWith(String startwith) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.like("LastName", startwith+"%"));
		return criteria.list();
	}

	public List<MemberRegistration> getDataLastNameEndsWith(String endwith) {
		Session ss = sFactory.openSession();
		Criteria criteria = ss.createCriteria(StaffRegistration.class);
		criteria.add(Restrictions.like("LastName", "%"+endwith));
		return criteria.list();
	}

}
