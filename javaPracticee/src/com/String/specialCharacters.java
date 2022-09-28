package com.String;

public class specialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		String txtt = "It\'s alright.";
		System.out.println(txtt);

		String text = "The character \\ is called backslash.";
		System.out.println(text);
		
		/*
		 * \n new line
		 * \r carriage return
		 * \t tab
		 * \b backspace
		 * \f form feed
		 */
		
		String newWord = "Hello\nWorld!";
	    System.out.println(newWord);
	    
	    String word = "Hello\rWorld!";
	    System.out.println(word);
	    
	    String tab = "Hello\tWorld!";
	    System.out.println(tab);
	    
	    String backspace = "Hel\blo World!";
	    System.out.println(backspace);





	}

}
