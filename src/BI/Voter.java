package BI;

import DB.MySQLHandler;

public class Voter {
	MySQLHandler m= new MySQLHandler();
	private String name;
	private String cnic;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnic() {
		return cnic;
	}
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}
	public Voter(String name, String cnic) {
		this.name = name;
		this.cnic = cnic;
	}
	public Voter() {
	}
	public void addVoter(String cnic)
	{
		m.MySQLDB(cnic);
	}
	
	

}
