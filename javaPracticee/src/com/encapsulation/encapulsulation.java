package com.encapsulation;

public class encapulsulation {
	//declare class variables/attributes as private
	//provide public get and set methods to access and update the value of a private variable
	
	private String name;
	
	// Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	  //The get method returns the value of the variable name.
	  //The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.
	  //However, as the name variable is declared as private, we cannot access it from outside this class:

}
