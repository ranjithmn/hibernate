package customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class getCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Customer c=entityManager.find(Customer.class, 103);
		if(c!=null) {
			System.out.println(c.getCid());
			System.out.println(c.getName());
			System.out.println(c.getSal());
		}
		else {
			System.out.println("no data found");
		}
		
		
	}

}
