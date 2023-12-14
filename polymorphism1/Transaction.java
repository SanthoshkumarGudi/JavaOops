package com.kn.polymorphism1;

public class Transaction {

	public static void main(String[] args) {
		Payment p=new Payment();
		p.pay();
		p.offer();
		p.bill();
		
		//parent class reference variable can be used for calling the child methods
		p=new UPI();
		p.pay();
		
		p=new Wallet();
		p.pay();
		
		p=new Card();
		p.pay();
		
		

	}

}
