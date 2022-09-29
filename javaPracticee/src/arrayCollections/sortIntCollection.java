package arrayCollections;

import java.util.ArrayList;
import java.util.Collections; //import the collection class

public class sortIntCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(10);
		myNumbers.add(1);
		myNumbers.add(1000);
		myNumbers.add(234);
		
		Collections.sort(myNumbers);
		for(int y : myNumbers) {
			System.out.println(y);
		}

	}

}
