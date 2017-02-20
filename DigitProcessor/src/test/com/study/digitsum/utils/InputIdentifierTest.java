package test.com.study.digitsum.utils;

import org.junit.Test;

import com.study.digitsum.utils.InputIdentifier;
import com.study.digitsum.utils.InputReader;
import com.study.digitsum.utils.impl.InputConsoleReader;
import com.study.digitsum.utils.impl.InputFileReader;

import org.junit.Assert;

public class InputIdentifierTest {
	@Test
	public void inputConsoleReaderCreationPositive(){
		String[] input = {"123", "333",  "fff"};
		InputReader reader = InputIdentifier.getReader(input);
		boolean result = InputConsoleReader.class.equals(reader.getClass());
		Assert.assertTrue(result);
	}
	
	@Test
	public void inputFileReaderCreationEmptyInputPositive(){
		String[] input = {};
		InputReader reader = InputIdentifier.getReader(input);
		boolean result = InputFileReader.class.equals(reader.getClass());
		Assert.assertTrue(result);
	}
	
	@Test
	public void inputReaderCreationWrongInputPositive(){
		String[] input = {"ffff"};
		InputReader reader = InputIdentifier.getReader(input);
		boolean result = InputConsoleReader.class.equals(reader.getClass());
		Assert.assertTrue(result);
	}
}
