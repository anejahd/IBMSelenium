package com.practice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner month = new Scanner(System.in); //System.in is a standard input stream  
		System.out.println("Please enter your birthday month? -");
		String birthdayMonth = month.nextLine();
		
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter your birthday number? -");
		int birthNum = num.nextInt();*/
		
		String month = "November";
		int num = 18;
		String sign = "";

		if (month == "January") {
			if (num < 20)
				sign = "Capircorn";
			else
				sign = "Aquarius";			
		}
		else if (month == "February") {
			if (num < 19)
				sign = "Aquarius";
			else
				sign = "Pisces";
		}
		else if (month == "March") {
			if(num < 21)
				sign = "Pisces";
			else
				sign = "Aries";
		}
		else if (month == "April") {
			if(num < 20)
				sign = "Aries";
			else
				sign = "Tarus";
		}
		else if (month == "May") {
			if(num < 21)
				sign = "Taurus";
			else
				sign = "Gemini";
		}else if (month == "June") {
			if(num < 23)
				sign = "Cancer";
			else
				sign = "Leo";
		}
		else if (month == "July") {
			if(num < 23)
				sign = "Leo";
			else
				sign = "Virgo";
		}
		else if (month == "August") {
			if(num < 23)
				sign = "Virgo";
			else
				sign = "Libra";
		}
		else if (month == "November") {
			if(num < 22)
				sign = "Scorpio";
			else
				sign = "Sagittrius";	
		}
		else if (month == "December") {
			if(num <22)
				sign = "Sagittrius";
			else
				sign = "Capricorn";
		}
		System.out.println("The astrological sign for " + num + " " + month + " is " + sign );
			
		
		
		
		
		/*
		System.out.println("What's your number? -");
		int num = sc.nextInt();
		
		int i = 100;
		if(num < i) {
			System.out.println("Good Morning");
		}else if (num < i) {
			System.out.println("Good Afternoon");
		}else if (num < 1 ) {
			System.out.println("Good evening");
		} else {
			System.out.println("Sleep time");
		}*/
		
		

	}

}
