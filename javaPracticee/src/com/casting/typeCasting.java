package com.casting;

public class typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening casting - convert smaller type to larger types
		//byte -> short -> char -> int -> long -> float -> double
		
		//narrowing casting - manually converting a larger type to a smaller size type
		//double -> float -> long -> int -> char -> short -> byte
		
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		
		System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    double myDoublee = 9.78d;
	    int myIntt = (int) myDoublee; // Manual casting: double to int

	    System.out.println(myDoublee);   // Outputs 9.78
	    System.out.println(myIntt);      // Outputs 9
	    
	    /*
	     * 
	     * + addition
	     * - substraction
	     * * multiplication
	     * "/" division
	     * % modulus
	     * ++ increment
	     * --decrement
	     * 
	     */
	    
	    /*
	     * == equals to
	     * != not equal
	     * > greater
	     * < less than
	     * >= greater than or equal to
	     * <=less tan or equal to
	     */

	}

}
