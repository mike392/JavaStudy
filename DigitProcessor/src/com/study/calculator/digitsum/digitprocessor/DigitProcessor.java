package com.study.calculator.digitsum.digitprocessor;

public class DigitProcessor {
	
	public long getSumOfDigits(long value){
		long result = 0;
		if (String.valueOf(value).length() > 1){
			result = result + getSumOfDigits(value / 10);
		}
		return result + value % 10 ;
	}
}
