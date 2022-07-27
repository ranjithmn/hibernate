package customer;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@javax.persistence.Entity
 class Customer {
	@Id
	private int cid;
	private String name;
	private double sal;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
