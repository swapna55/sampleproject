package org.niit.dao;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.niit.model.Cart;
import org.niit.model.CartItem;
import org.niit.model.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class OrderDaoImpl implements OrderDao{

        @Autowired
        private SessionFactory sessionFactory;

        @Autowired
        private CartDao cartdao;
        public void addOrder(UserOrder userOrder) {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(userOrder);
            session.flush();
        }
        public double getOrderGrandTotal(int cartId) {
            double grandTotal=0;
            Cart cart = cartdao.getCartById(cartId);
            List<CartItem> cartItems = cart.getCartItems();

            for (CartItem item : cartItems) {
                grandTotal+=item.getTotalPrice();
            }

            return grandTotal;
        }
}
