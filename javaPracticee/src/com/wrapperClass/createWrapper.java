package com.wrapperClass;

public class createWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	    
	    Integer myIntt = 5;
	    Double myDoublee = 5.99;
	    Character myCharr = 'A';
	    System.out.println(myIntt.intValue());
	    System.out.println(myDoublee.doubleValue());
	    System.out.println(myCharr.charValue());
	    
	    Integer myInti = 100;
	    String myStringg = myInti.toString();
	    System.out.println(myStringg.length());

	}

}
