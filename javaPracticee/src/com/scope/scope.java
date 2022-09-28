package com.scope;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code here CANNOT use x

	    int x = 100;

	    // Code here can use x
	    System.out.println(x);
	    
	 // Code here CANNOT use x

	    { // This is a block

	      // Code here CANNOT use x

	      int y = 100;

	      // Code here CAN use x
	      System.out.println(y);

	   } // The block ends here

	  // Code here CANNOT use x

	 }
}


