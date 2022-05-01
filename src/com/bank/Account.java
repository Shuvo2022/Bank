package com.bank;

public class Account {
	private double withdraw;
	private double deposit;
	private double totalBalance;
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		if(withdraw > 10000) {
			System.out.println("Withdrew amount should be less than 10000");
		}
		this.withdraw = withdraw;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		if(deposit > 10000) {
			System.out.println("deposit amount should be less than 8000");
		}
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
