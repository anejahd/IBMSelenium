package com.HashSet;

import java.util.HashSet;

public class hashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    cars.contains("Mazda");
	    
	    for (String i : cars) {
	        System.out.println(i);
	      }

	    //cars.remove("Volvo");

	    //remove all HashSet
	    //cars.clear();


	}

}
