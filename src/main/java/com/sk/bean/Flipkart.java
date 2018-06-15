package com.sk.bean;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

public class Flipkart{
	@Autowired
	Dtdc dtdc;

	Flipkart(){
		System.out.println("FlipKartt 0-param constructor Executed");
	}
	
	public int productOrder(String[] item) {
		System.out.println("Product order Method Executed ");
		return new Random().nextInt(10);
	}

	@Override
	public String toString() {
		return "Flipkart [dtdc=" + dtdc + "]";
	}
	
	

}
