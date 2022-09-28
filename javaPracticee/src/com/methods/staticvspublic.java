package com.methods;

public class staticvspublic {
	//public which can only be accessed by objects
	//static means that the method belongs to the Main class and not an object of the Main class. 

	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	 public void myPublicMethod() {
		 System.out.println("Public methods must be called by creating objects");
	 }
	 
	 //Main method
	 public static void main(String[] args) {
		 myStaticMethod(); //call the static method
		 //myPublicMethod(); //this would compile error
		 
		 staticvspublic myObj = new staticvspublic(); //create an object of main
		 myObj.myPublicMethod(); //Call the public method of object
		 
	 }
}
