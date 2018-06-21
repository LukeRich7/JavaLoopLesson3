package com.lukerichardson.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		int[] number = new int[5];
		// declare integer array with count of 5
		int index = 0;
		// declare iterator
		for(int i = 0; i < 5; i++) {
			int userInput = StudentHelper.ReadInputInt();
			number[index]=userInput;
			index++;
			}
		// for loop to add user input data to array
		for(int ro = 4; ro > -1; ro--) {
			System.out.println(number[ro]);
		}
		// print to console in reverse order
		for(int odd = 0; odd < 5; odd++) {
			if(odd % 2 == 0) {
				System.out.println(number[odd]);
			}
		}
		// print to console only odd indexes
		}}