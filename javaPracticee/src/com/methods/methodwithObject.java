package com.methods;

public class methodwithObject {
	  // Create a fullThrottle() method
	public void fullThottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	//Create a speed() method and add a parameter
	public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	}
	
	public static void main(String[] args) {
		methodwithObject myCar = new methodwithObject();
		myCar.fullThottle(); //call the fullThrottle() method
		myCar.speed(200); //Call the speed method
		
		// The car is going as fast as it can!
		// Max speed is: 200
	}

}
