package com.endurance1.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.endurance1.entity.MemberRegistration;

@Repository
public class FitnessDao {

	@Autowired
	SessionFactory sf;

	public List<MemberRegistration> getMember() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);

		return criteria.list();
	}

	public MemberRegistration getMemberById(int id) {
		Session ss = sf.openSession();
		return ss.get(MemberRegistration.class, id);

	}

	public String addMember(MemberRegistration mr) {

		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(mr);
		tr.commit();
		ss.close();
		return "Data Saved Successfully..";
	}

	public List<MemberRegistration> getByEmail(String email) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("Email", email));

		return criteria.list();

	}

	public List<MemberRegistration> getByFirstAndLastName(MemberRegistration memberRegistration) {

		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("FirstName", memberRegistration.getFirstName()));
		criteria.add(Restrictions.eq("LastName", memberRegistration.getLastName()));

		return criteria.list();
	}

	public List<MemberRegistration> getByGender(String gender) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("Gender", gender));
		return criteria.list();
	}

	public List<MemberRegistration> getByMembershipStartingDate(String date) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("MembershipStartDate", date));
		return criteria.list();

	}

	public List<MemberRegistration> getByMobileNumber(String mobilenumber) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("Mobile", mobilenumber));
		return criteria.list();

	}

	public List<MemberRegistration> getByAddress(String cityName) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("Address", cityName));
		return criteria.list();
		
	}

	public String updateEmail(MemberRegistration memberRegistration) {
		Session ss = sf.openSession();
		ss.update(memberRegistration);
		ss.beginTransaction().commit();
		ss.close();
		return "Email updated";
		
	}

	public String deleteUser(int id) {
		Session ss = sf.openSession();
		ss.delete(id);
		ss.beginTransaction().commit();
		ss.close();
		return "user Deleted successfully";
		
	}

	public List<MemberRegistration> sortByMemberId() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add((Criterion) Order.asc("MemberID"));
		return criteria.list();
		
	}

	public List<MemberRegistration> sortByFirstName() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add((Criterion) Order.asc("FirstName"));
		return criteria.list();
		
	}
	
	public List<MemberRegistration> sortByMembershipStartDate() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add((Criterion) Order.asc("MembershipStartDate"));
		return criteria.list();
		
	}

	public List<MemberRegistration> getOnlyFirstNameAndLastNameWithId() {
		
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		
		return criteria.list();
		
	}

	public List<MemberRegistration> getOnlyFirstNameAndLastNameOtherThan(String firstName) {
		
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.ne("FirstName",firstName ));
		return criteria.list();
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndGender() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		return criteria.list();
		
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndMobileNumber() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		return criteria.list();
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddress() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		return criteria.list();
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndEmail() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		return criteria.list();
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndMemberShipStartDate() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		return criteria.list();
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndEmergencyNumber() {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		return criteria.list();
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressWithSpecificCity(String city) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("Address", city));
		return criteria.list();
		
	}

	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressBelowSpecificDate(String date) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.lt("DateofBirth",date));
		return criteria.list();
	}

	public List <MemberRegistration>getOnlyFirstNameLastNameAndAddressBelowSpecificMemberShipDate(String date) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.lt("MembershipStartDate", date));
		return criteria.list();
		
	}
	
	public List<MemberRegistration> getOnlyFirstNameLastNameAndAddressAboveSpecificDate(String date) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.gt("DateofBirth", date));
		return criteria.list();
	}

	public List<MemberRegistration> getAllMaleWithSpecificAddress(String address) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.eq("Address", address));
		return criteria.list();
	}

	public List<MemberRegistration> getDataFirstNameStartWith(String startwith) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.like("FirstName", startwith+"%"));
		return criteria.list();
		
	}

	public List<MemberRegistration> getDataFirstNameEndsWith(String endwith) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.like("FirstName", "%"+endwith));
		return criteria.list();
		
	}

	public List<MemberRegistration> getDataLastNameStartWith(String startwith) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.like("LastName", startwith+"%"));
		return criteria.list();
		
	}

	public List <MemberRegistration>getDataLastNameEndsWith(String endwith) {
		Session ss = sf.openSession();
		Criteria criteria = ss.createCriteria(MemberRegistration.class);
		criteria.add(Restrictions.like("LastName", "%"+endwith));
		return criteria.list();
		
	}
	

}
