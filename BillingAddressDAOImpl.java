package org.niit.dao;

import org.hibernate.SessionFactory;
import org.niit.model.BillingAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("BillingAddressDAO")
public class BillingAddressDAOImpl implements BillingAddressDAO {

	@Autowired
	SessionFactory sessionFactory;

	public BillingAddressDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public  BillingAddress saveOrUpdate(BillingAddress billingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
		return billingAddress;

	}

	@Transactional
	public void deleteBillingAddress(String billingAddressId) {
		BillingAddress billingAddressToDelete = new BillingAddress();
		billingAddressToDelete.setBillingAddressId(billingAddressId);
		sessionFactory.getCurrentSession().delete(billingAddressToDelete);

	}

	@Transactional
	public BillingAddress getBillingAddress(String billingAddressId) {
		return (BillingAddress) sessionFactory.getCurrentSession().get(BillingAddress.class, billingAddressId);
	}

}
