package study.calculator.sumofdigits.digit;

public class Digit {
	
	public long getSumOfDigits(long value){
		long result = 0;
		if (String.valueOf(value).length() > 1){
			result = result + getSumOfDigits(value / 10);
		}
		return result + value % 10 ;
	}
}
