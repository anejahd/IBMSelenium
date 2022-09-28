package com.Scanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter name");
		
		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName);

	}

}
