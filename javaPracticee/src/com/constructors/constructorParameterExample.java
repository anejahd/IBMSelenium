package com.constructors;

public class constructorParameterExample {
	int modelYear;
	String modelName;

	  public constructorParameterExample(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
		  constructorParameterExample myCar = new constructorParameterExample(1969, "Mustang");
		  System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
}
