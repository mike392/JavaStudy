package test.com.study.tune.util;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.study.tune.util.InputFileReader;

public class InputFileReaderTest {
	@Test
	public void readInputPositiveTest(){
		List<String> input = InputFileReader.readInput();
		Assert.assertFalse(input.isEmpty());
	}
}
