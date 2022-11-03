package org;

public class AxisBank extends BankInfo {
	public void deposit(int deposit) {
		System.out.println("deposit :"+deposit);
	}
	public static void main(String[] args) {
		AxisBank max=new AxisBank();
		max.deposit(5000);
	}

}
