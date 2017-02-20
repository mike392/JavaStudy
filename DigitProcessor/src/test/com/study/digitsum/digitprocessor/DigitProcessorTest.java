package test.com.study.digitsum.digitprocessor;

import org.junit.Assert;
import org.junit.Test;

import com.study.digitsum.digitprocessor.DigitProcessor;

public class DigitProcessorTest {
	@Test
	public void getSumOfDigitsPositive(){
		long result = DigitProcessor.getSumOfDigits(13L);
		Assert.assertEquals(4L, result);
	}
	
	public void getSumOfNegativeDigitsPositive(){
		long result = DigitProcessor.getSumOfDigits(-12L);
		Assert.assertEquals(3L, result);
	}
}
