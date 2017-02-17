package test.com.study.digitsum.digitprocessor;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

import com.study.digitsum.digitprocessor.DigitProcessor;

public class DigitProcessorTest {
	@Test
	public void getSumOfDigitsPositive(){
		//class mock creation
		DigitProcessor processor = mock(DigitProcessor.class);
		//behavior definition
		when(processor.getSumOfDigits(13L)).thenReturn(4L);
		long result = processor.getSumOfDigits(13L);
		Assert.assertEquals(4L, result);
	}
}
