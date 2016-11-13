package org.niit.dao;

import org.niit.model.BillingAddress;

public interface BillingAddressDAO {

	public BillingAddress saveOrUpdate(BillingAddress billingAddress);


	void deleteBillingAddress(String billingAddressId);

	
BillingAddress getBillingAddress(String billingAddressId);

}
