package com.practice;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		for(int i =0; i < 10; i++) {
			System.out.println(i);
		}*/
		
		//displays each even numbers
		/*for(int y =0; y < 10; y = y +2) {
			System.out.println(y);
		}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    break;
			  }
			  System.out.println(i);
			}
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {
			    continue;
			  }
			  System.out.println(i);
			}
		// continue statement breaks one iteration in the loop. skips vale 4*/
		
		//Modulus
		//even number
		int a;
		int num = 20;
		for(a = 1; a <= num; a++) {
			if(a % 2 == 0) {
				System.out.println(a);
			}
		}
		
		//odd numbers
		for(a=1; a < num; a++) {
			if(a %2 == 1) {
				System.out.println(a);
			}
		}
		
		

	}

}
