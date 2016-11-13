package org.niit.controller;




import javax.servlet.http.HttpSession;

import org.niit.dao.BillingAddressDAO;
import org.niit.dao.CardDetailDao;
import org.niit.dao.CartDao;
import org.niit.dao.CartItemDao;
import org.niit.dao.ShippingAddressDAO;
import org.niit.dao.UserdetailsDAO;
import org.niit.model.BillingAddress;
import org.niit.model.CardDetail;
import org.niit.model.Cart;

import org.niit.model.Product;
import org.niit.model.ShippingAddress;
import org.niit.model.Userdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class FlowController {
	
	@Autowired
	 ShippingAddress shippingAddress;

	@Autowired
	 BillingAddress billingAddress;
	@Autowired
	private BillingAddressDAO billingAddressDAO;

	@Autowired
	private ShippingAddressDAO shippingAddressDAO;



	
	@Autowired
	private CardDetail cardDetail;

	/*@Autowired
	private ShippingAddressDAO shippingAddressDAO;

	@Autowired
	private BillingAddressDAO billingAddressDAO;
*/	@Autowired
	private CardDetailDao cardDetailDao;
	@Autowired
	Userdetails userdetails;
	@Autowired
	UserdetailsDAO userdetailsDAO;

	@Autowired
	CartDao cartDAO;

	@Autowired
	Cart cart;
	 /*@Autowired
	    private SessionFactory sessionFactory;

	    @Autowired
	    private OrderDao orderdao;*/
	@Autowired
	CartItemDao cartItemDAO;
	@Autowired
	HttpSession httpSession;
	@Autowired
	Product product;
	
	/* public Cart validate(int cartId) throws IOException {
	        Cart cart=getCartById(cartId);
	        if(cart==null||cart.getCartItems().size()==0) {
	            throw new IOException(cartId+"");
	        }
	        update(cart);
	        return cart;
	    }
	 public Cart getCartById (int cartId) {
	        Session session = sessionFactory.getCurrentSession();
	        return (Cart) session.get(Cart.class, cartId);
	    }

	    public void update(Cart cart) {
	        int cartId = cart.getCartId();
	        double grandTotal = orderdao.getOrderGrandTotal(cartId);
	        cart.setGrandTotal(grandTotal);

	        Session session = sessionFactory.getCurrentSession();
	        session.saveOrUpdate(cart);
	    }*/
	public String addShippingAddress(ShippingAddress shippingAddress) {
		userdetails = userdetailsDAO.getCustomerByUserName(SecurityContextHolder.getContext()
				.getAuthentication().getName());

		shippingAddress.setUserid(userdetails.getUserid());
		//checkoutDetails.setShippingAddress(shippingAddress);

		this.shippingAddress.setUserid(userdetails.getUserid());
		this.shippingAddress.setLine1(shippingAddress.getLine1());
		this.shippingAddress.setLine2(shippingAddress.getLine2());
		this.shippingAddress.setCity(shippingAddress.getCity());
		this.shippingAddress.setState(shippingAddress.getState());
		this.shippingAddress.setCountry(shippingAddress.getCountry());
		this.shippingAddress.setZipCode(shippingAddress.getZipCode());
		/*shippingAddress=shippingAddressDAO.saveOrUpdate(shippingAddress);
	*/	
		return "success";
	}

	public String addBillingAddress( BillingAddress billingAddress) {
		userdetails = userdetailsDAO.getCustomerByUserName(SecurityContextHolder.getContext().getAuthentication().getName());
		billingAddress.setUserid(userdetails.getUserid());
		//checkoutDetails.setBillingAddress(billingAddress);

		this.billingAddress.setUserid(userdetails.getUserid());
		this.billingAddress.setLine1(billingAddress.getLine1());
		this.billingAddress.setLine2(billingAddress.getLine2());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setCountry(billingAddress.getCountry());
		this.billingAddress.setZipCode(billingAddress.getZipCode());
        billingAddress=billingAddressDAO.saveOrUpdate(billingAddress);
        
		return "success";
	}

	/*public String addCardDetails(CardDetail cardDetail) {
		userdetails = userdetailsDAO.getCustomerByUserName(SecurityContextHolder.getContext().getAuthentication().getName());

		cardDetail.setUserid(userdetails.getUserid());
		cardDetail.setTotalCost(cartDAO.getCartById(userdetails.getUserid()).getGrandTotal());
		cardDetailDAO.saveOrUpdate(cardDetail);

		List<CartItem> listOfCartItems = cartItemDAO.getCartItemByItemId(userdetails.getUserid());

		listOfCartItems = cartItemDAO.getCartItemsByCustomerId(userdetails.getUserid());

		cart = cartDAO.getCartById(userdetails.getUserid());

		cart.setCartId(cart.getCartId());
		cart.setCustomerId(cart.getUserdetails());
		cart.setNoOfProducts(listOfCartItems.size());

		shippingAddressDAO.saveOrUpdate(checkoutDetails.getShippingAddress());
		billingAddressDAO.saveOrUpdate(checkoutDetails.getBillingAddress());
		cartDAO.update(cart);

		httpSession.setAttribute("noOfProducts", cart.getNoOfProducts());

		return "success";
	}

	*/
	

}
