package org.niit.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
@Entity
public class UserOrder implements Serializable{

    private static final long serialVersionUID = 16L;

    @Id
    @GeneratedValue
    private int userOrderId;
	@OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "userId")
    private Userdetails userdetails;

	
    public int getUserOrderId() {
		return userOrderId;
	}

	public void setUserOrderId(int userOrderId) {
		this.userOrderId = userOrderId;
	}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

	public Userdetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(Userdetails userdetails) {
		this.userdetails = userdetails;
	}


  
   
}
