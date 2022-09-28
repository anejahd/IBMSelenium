package com.classAttributes;

public class attributes {
	final int x = 5; //can't override with final.
	int y;
	
	public static void main(String[] args) {
		attributes myObj = new attributes();
		System.out.println(myObj.x);
		
		attributes ourObj = new attributes();
		ourObj.y=40;
		System.out.println(ourObj.y);
		//myObj.x = 25; //override. x is 25.
		System.out.println(myObj.x);
	}

}
