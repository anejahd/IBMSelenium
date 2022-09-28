package com.enums;

//enum is a special class that represents a group of constants (unchangeable variables, like final variables)
enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class Enums {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
	}

}
