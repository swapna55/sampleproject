package org.niit.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Userdetails")
@Component
public class Userdetails implements Serializable{
	private static final long serialVersionUID = 4657462015039726030L;


	@Id
	/*@GeneratedValue(strategy = GenerationType.AUTO)*/

	
	private String userid;
	public Userdetails() {
		this.userid = "USER" + UUID.randomUUID().toString().substring(24).toUpperCase();
	}

	private String Fullname;
	private boolean enabled;
	private String username;
	private String email;
	private String mobile;
	private String password;
	private String Role;
	@OneToOne
	@JoinColumn(name = "cartId")
	@JsonIgnore
	private Cart cart;

	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}

}