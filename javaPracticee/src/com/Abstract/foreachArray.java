package com.Abstract;

import java.util.ArrayList;

public class foreachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for (String i : cars) {
	      System.out.println(i);
	    }
	}

}
