package com.classAttributes;

public class multipleAttributes {
	String fname = "Anejah";
	String lname = "Crooms";
	int age = 28;
	
	public static void main(String[] args) {
		
		multipleAttributes myObj = new multipleAttributes();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Age: " + myObj.age);
	}

}
