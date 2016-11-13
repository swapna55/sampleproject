package org.niit.dao;

import org.niit.model.UserOrder;

public interface OrderDao {

    void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}
