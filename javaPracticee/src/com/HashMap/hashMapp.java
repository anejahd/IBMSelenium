package com.HashMap;

import java.util.HashMap;


public class hashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    capitalCities.get("England");
	    System.out.println(capitalCities.size());
	    
	    //Print keys
	    //use keySet() method if you want the keys, and use the values() method
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println(i);
	    	}
	    
	    for (String i : capitalCities.values()) {
	    	  System.out.println(i);
	    	}
	    
	 // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }

	}

}
