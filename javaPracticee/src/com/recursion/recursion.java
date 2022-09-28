package com.recursion;

public class recursion {
	//When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. 
	//When k becomes 0, the function just returns 0. When running, the program follows these steps
	public static void main(String[] args) {
	    int result = sum(10);
	    System.out.println(result);
	  }
	  public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	}

}
