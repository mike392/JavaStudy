package com.study.calculator.digitsum.main;

import java.lang.reflect.Array;

import com.study.calculator.digitsum.digitprocessor.DigitProcessor;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (Array.getLength(args)>0){
			for (String s : args) {
				DigitProcessor digitProcessor = new DigitProcessor();
				long result = digitProcessor.getSumOfDigits(Long.parseLong(s));
				System.out.println("Number " + s + " has sum of digits equal to " + String.valueOf(result));
			}
		} else {
			System.out.println("Please, enter the digit");
		}
	}
}
