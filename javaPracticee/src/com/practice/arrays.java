package com.practice;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		String[] ourcars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(ourcars[0]);
		// Outputs Volvo
		
		String[] carss = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0] = "Opel";
		System.out.println(carss[0]);
		// Now outputs Opel instead of Volvo
		
		String[] mycars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(mycars.length);
		// Outputs 4
		
		
		String[] mycarss = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < mycarss.length; i++) {
		  System.out.println(mycarss[i]);
		}*/
		
		//two-dimensional array
		int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
		for(int i = 0; i < myNumbers.length; i++) {
			for(int j=0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
			
		
		
		

	}

}
