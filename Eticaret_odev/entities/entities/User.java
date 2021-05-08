package entities;


import entities.Entity;

public class User implements Entity {
	private int ›d;
	private String firtsName;
	private String lastName;
	private String email;
	private String password;
	private boolean flag = false;
	
	public User() {
		
		
	}
	
	
	public User( int id, String firtsName,String lastName,String email,String password) {
		
		›d = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
	}


	public int get›d() {
		return ›d;
	}


	public void set›d(int id) {
		›d = id;
	}


	public String getFirtsName() {
		return firtsName;
	}


	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	
	

		
	}


