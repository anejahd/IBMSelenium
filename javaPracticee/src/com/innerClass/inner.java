package com.innerClass;
//In Java, it is also possible to nest classes (a class within a class). 
//The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable

class OuterClass{
	int x = 10;
	
	class InnerClass{
		int y = 5;
	}
}

public class inner {
	
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}
	
	//Outputs 15 (5 + 10)

}
