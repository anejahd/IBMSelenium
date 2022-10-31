package com.exceptionss;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		//The finally statement lets you execute code, after try...catch, regardless of the result:
		try {
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    } finally {
		      System.out.println("The 'try catch' is finished.");
		    }
	}

}
