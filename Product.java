package org.niit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "product")
@Component
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String  id;
	
	
	
	/*
	@Column(name="ID")*/

	private String name;    
	private String description;
	private long price;
	@Min(value=0,message="Cannot give a quantity less than zero")
	private int quantity;

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
	@Transient
	private MultipartFile Image;
	 @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JsonIgnore
	    private List<CartItem> cartItemList;
	   private String category_id;
		
		
		private String supplier_id;
		
	
	
	public MultipartFile getImage() {
		return Image;
	}
	public void setImage(MultipartFile image) {
		Image = image;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	

	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	
	@ManyToOne
    @JoinColumn(name="category_id", nullable = false, updatable = false, insertable = false)
   	private Category category;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@ManyToOne
    @JoinColumn(name="supplier_id",nullable = false, updatable = false, insertable = false)
	private Supplier supplier;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getProductId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
