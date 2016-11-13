package org.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import org.niit.dao.UserdetailsDAOImpl;
import org.niit.model.Cart;
import org.niit.model.Userdetails;

@EnableTransactionManagement
@Repository("userdetailsDAO")
public class UserdetailsDAOImpl implements UserdetailsDAO {
private static final Logger log = LoggerFactory.getLogger(UserdetailsDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	public UserdetailsDAOImpl(SessionFactory sessionFactory)
	{
	this.sessionFactory = sessionFactory;

	}
@Transactional
	public boolean save(Userdetails userdetails)
	{
	try {
		
		 Session session = sessionFactory.getCurrentSession();
		log.debug("starting of save method");
		sessionFactory.getCurrentSession().save(userdetails);
		userdetails.setRole("ROLE_USER");
		userdetails.setEnabled(true);
		 Cart newCart = new Cart();
	        newCart.setUserdetails(userdetails);
	        userdetails.setCart(newCart);
	        session.saveOrUpdate(userdetails);
	        session.saveOrUpdate(newCart);

	        session.flush();

		log.debug("Ending of save method");
		return true;
	}
	catch(Exception e)
	{
		log.error("Exception occured in save" +e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
@Transactional
	public boolean update(Userdetails userdetails)
	{
	try {
		log.debug("starting of update method");
		sessionFactory.getCurrentSession().update(userdetails);
		log.debug("starting of update method");
		return true;
	}
	catch(Exception e)
	{
		log.error("Exception occured in update" +e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
@Transactional
	public boolean delete(Userdetails userdetails)
	{
	try {
		log.debug("starting of delete method");
		sessionFactory.getCurrentSession().delete(userdetails);
		log.debug("starting of delete method");
		return true;
	}
	catch(Exception e)
	{
		log.error("Exception occured in delete" +e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
@Transactional
public Userdetails get(String username)
{
	String hql = "from Userdetails where username= "+" '" +username+ "'";
	Query query =sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Userdetails> list = query.list();
	if(list == null || list.isEmpty())
	{
		return null;
	}
	else
	{
		return list.get(0);
	}
}

@Transactional
public Userdetails isValidUser(String username,String password)
{
	String hql = "from Userdetails where username = '" + username +"' and password= '" +password +"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Userdetails> list = query.list();
	if(list == null)
	{
		return null;
	}
	else
	{
		return list.get(0);
	}
}


@SuppressWarnings("unchecked")
@Transactional
public List<Userdetails> list()
{
	String hql = "from Userdetails where username="+"'"+"'";
	Query query =sessionFactory.getCurrentSession().createQuery(hql);
	return query.list();
}
/*@Transactional
public Userdetails getUserdetailsByUsername(String username){
	String hql="from Userdetails where username="+"'"+username+"'";
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Userdetails> listOfUsers = query.list();
	if( listOfUsers !=null && !listOfUsers.isEmpty()){
		return listOfUsers.get(0);
}
	return null;

}
*/@Transactional
public List<Userdetails> listUserdetails()
{
		String hql = "from Userdetails";
	
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
List<Userdetails> listOfCustomers = query.list();
	

	return listOfCustomers;

	}



@Transactional
public Userdetails getCustomerByUserName(String username)
{
	String hql = "from Userdetails where username=" + "'" + username + "'";
	
Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
@SuppressWarnings("unchecked")
List<Userdetails> listOfCustomers = query.list();
	
if (listOfCustomers != null && !listOfCustomers.isEmpty()){

	return  listOfCustomers.get(0);

}
		
	
	return null;


}
public Userdetails getUserdetailsByUsername(String username) {
	// TODO Auto-generated method stub
	return null;
}
}
