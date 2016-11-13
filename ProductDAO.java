package org.niit.dao;

import java.util.List;

import org.niit.model.Product;
import org.springframework.web.multipart.MultipartFile;



public interface ProductDAO {


	public List<Product> list();

	public Product get(String id);

	public void saveOrUpdate(Product product);

	public void delete(String id);

	public MultipartFile getImage();
	Product getProductById(String id);
	
	List<Product> searchProduct(String keyword);


}
