package com.study.digitsum.digitprocessor;

public class DigitProcessor {
	
	public static long getSumOfDigits(long value){
		long result = 0;
		if (String.valueOf(value).length() > 1){
			result = result + getSumOfDigits(Math.abs(value) / 10);
		}
		return result + Math.abs(value) % 10 ;
	}
}
