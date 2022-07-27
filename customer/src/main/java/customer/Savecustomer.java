package customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Savecustomer {
	public static void main(String[] args) {
		
	

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Customer c=new Customer();
	c.setCid(103);
	c.setName("ranjith");
	c.setSal(5500.99);
	
	entityTransaction.begin();
	entityManager.persist(c);
	entityTransaction.commit();
	
	

	}
	
}
