package com.practicejava;

public class interateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {4, 28, 31};
		
		for(int i =0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		String[] animals = {"cat", "dog", "mouse"};
		
		for(String animal:animals) {
			System.out.println(animal);
		}
	}

}
