package study.calculator.sumofdigits;

import java.lang.reflect.Array;

import study.calculator.sumofdigits.digit.Digit;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (Array.getLength(args)>0){
			for (String s : args) {
				Digit digit = new Digit();
				long result = digit.getSumOfDigits(Long.parseLong(s));
				System.out.println("Number " + s + " has sum of digits equal to " + String.valueOf(result));
			}
		} else {
			System.out.println("Please, enter the digit");
		}
	}
}
