package com.sk.bean;

import java.util.Arrays;


public class Dtdc 
{
	private String[] item;
	
	public Dtdc() {
		System.out.println("Dtdc 0-param Constructor Executed");
		System.out.println("Auto Wire Constructor Executed ");
	}
   public void setItem(String[] item){
	  System.out.println("SetItem() method Executed");
	  this.item=item;
   }
   public String toString(){
	   return Arrays.toString(item);
   }
	   
   
}
