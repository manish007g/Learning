package com.ManishGupta;

public class VipCustomer {

	private String name;
	private int limit;
	private String mail;
	
	public VipCustomer(){
		this.name="Default Name";
		this.limit=10000;
		this.mail="Default mail";
	}
	
	public VipCustomer(String name,int limit){
		this.name=name;
		this.limit=limit;
		this.mail="Mansi#@234";
		}
	
	public VipCustomer(String name,int limit,String mail){
		this.name=name;
		this.limit=limit;
		this.mail=mail;
		}

	public String getName() {
		return name;
	}

	public int getLimit() {
		return limit;
	}

	public String getMail() {
		return mail;
	}
	
	
}
