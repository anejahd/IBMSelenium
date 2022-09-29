//Array List: resizable array
package com.Array;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Tesla");
		System.out.println(cars);
		
		System.out.println(cars.get(0));
		cars.set(4, "Maserati");
		System.out.println(cars);
		
		//size
		System.out.println(cars.size()); //5

		
		
		/*cars.remove(0); //remove Volvo
		System.out.println(cars);
		
		cars.clear(); //remove all cars
		System.out.println(cars);*/
	}

}
