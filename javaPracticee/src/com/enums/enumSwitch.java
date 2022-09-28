package com.enums;
enum Levels{
	LOW,
	MEDIUM,
	HIGH
}

public class enumSwitch {
	public static void main(String[] args) {
		Levels myVar = Levels.MEDIUM;
		
		switch(myVar) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		}
		
		//enums type has a value method which returns an array of all enum constants.
		//this method is useful when you want to loop through the constants of an enum
		for(Levels myVars : Levels.values()) {
			System.out.println(myVars);
		}
	}
}
