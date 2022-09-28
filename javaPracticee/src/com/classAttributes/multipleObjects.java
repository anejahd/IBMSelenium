package com.classAttributes;

public class multipleObjects {
	int x = 5;
	
	public static void main(String[] args) {
		multipleObjects myObj1 = new multipleObjects();
		multipleObjects myObj2 = new multipleObjects();
		myObj2.x = 25;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
	}

}
