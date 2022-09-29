package arrayCollections;

import java.util.ArrayList;
import java.util.Collections; //import the collection class

public class sortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Tesla");
		Collections.sort(cars); //Sort cars
		for(String i : cars) {
			System.out.println(i);
		}
		
		
			
		}



}


