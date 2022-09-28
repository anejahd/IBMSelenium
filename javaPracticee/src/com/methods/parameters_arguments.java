package com.methods;

public class parameters_arguments {
	static void  ourParameters(String fname, int age) {
		System.out.println(fname + " Crooms is " + age + " years old");
	}
	
	static int myMethods(int x) {
		return 5 + x;
		
	}
	
	static int ourMethods(int x, int y) {
		return x + y;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Information can be passed to methods as parameter. Parameters act as variables inside the method.
		//Parameters are specified after the method name, inside the parentheses.
		
		ourParameters("Anejah", 28);
		ourParameters("Benny", 5);
		
		//when a parameter is passed to the method it is called an arguments. 
		//So from the example above: fname is a parameter, while Anejah and Benny are the arguments
		
		//working with multiple parameters, the method call must have the same number of arguments as there are parameters,
		//and the arguments must be passed in the same order.
		
		System.out.println(myMethods(28));
		
		int z = ourMethods(28, 5);
		System.out.println(z);
		


	}

}
