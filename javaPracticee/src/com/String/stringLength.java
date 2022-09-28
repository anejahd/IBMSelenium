package com.String;

public class stringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		String txtt = "Hello World";
		System.out.println(txtt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txtt.toLowerCase());   // Outputs "hello world"

		String text = "Please locate where 'locate' occurs!";
		System.out.println(text.indexOf("locate")); // Outputs 7
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		//Java uses the + operator for both addition and concatenation.

		//Numbers are added. Strings are concatenated.
		
		int x = 10;
	    int y = 20;
	    int z = x + y;
	    System.out.println(z);
	}

}
