package customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateCustomer {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Customer c=new Customer();
		
		c.setCid(103);
		c.setName("raks");
		c.setSal(5456.00);
		
		entityTransaction.begin();
		entityManager.merge(c);
		entityTransaction.commit();
		
		

	}

}
