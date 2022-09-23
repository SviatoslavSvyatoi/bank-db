package com.solvd.laba.bank.models;

import java.util.List;

public class Account {
	private Integer ac_no;
	private Double balance;
	private String ac_type;
//	private Integer user_id;
	
	private List<Integer> transactions_ids;
	private List<Integer> card_ids;
	private List<Integer> account_services_ids;
	
	public Account() {
	}
	public Account(Integer ac_no, Double balance, String ac_type) {
		this.ac_no = ac_no;
		this.balance = balance;
		this.ac_type = ac_type;
	//	this.user_id = user_id;
	}
	public Integer getAc_no() {
		return ac_no;
	}
	public void setAc_no(Integer ac_no) {
		this.ac_no = ac_no;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
//	public Integer getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(Integer user_id) {
//		this.user_id = user_id;
//	}
}
