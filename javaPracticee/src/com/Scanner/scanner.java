package com.Scanner;
//To create your own package, you need to understand that 
//Java uses a file system directory to store them. Just like folders on your computer:



import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter name");
		
		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName);
		
		//Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. 
		//In our example, we will use the nextLine() method, which is used to read a complete line:

	}

}
