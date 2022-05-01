package com.bank;

public class Account {
	private double withdraw;
	private double deposit;
	private double totalBalance;
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	@Override
	public String toString() {
		return "Account [withdraw=" + withdraw + ", deposit=" + deposit + ", totalBalance=" + totalBalance + "]";
	}
	
	

}
