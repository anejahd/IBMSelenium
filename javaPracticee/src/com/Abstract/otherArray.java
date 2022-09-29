package com.Abstract;

import java.util.ArrayList;

public class otherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an array
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10); //add 10 store numbers
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		for(int i : myNumbers) {
			System.out.println(i);
		}

	}

}
