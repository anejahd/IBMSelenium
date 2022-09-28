package com.constructors;

public class parameters {
	int x;
	
	public parameters(int y) {
		x = y;
	}
	
	public static void main(String[] args) {
		parameters myObj = new parameters(5);
		System.out.println(myObj.x);
	}

}
