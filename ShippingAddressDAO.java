package org.niit.dao;

import org.niit.model.ShippingAddress;

public interface ShippingAddressDAO {

	public ShippingAddress saveOrUpdate(ShippingAddress shippingAddress);
	
	void deleteShippingAddress(String shippingAddressId);
	
	ShippingAddress getShippingAddress(String shippingAddressId);
}
