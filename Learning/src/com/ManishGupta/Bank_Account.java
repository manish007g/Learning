package com.ManishGupta;

public class Bank_Account {
 
	private String acc_num;
	private int bal;
	private String name;
	private String mail;
	private int phone;
	
	public Bank_Account(){
		
	}

	public String getAcc_num() {
		return acc_num;
	}
	public void setAcc_num(String acc_num) {
		this.acc_num = acc_num;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	 public void depositFund(int deposit){
		 bal+=deposit;
		 System.out.println("The new balance is " + bal);
		 }
	 public void withdrawFund(int withdraw){
		 if ((bal-withdraw)<0)
			 System.out.println("Insufficient Balance");
		 else 
		 {
			 bal-=withdraw;
			 System.out.println("The new balance is " + bal);
			 
		 }
		 
	 }
}
