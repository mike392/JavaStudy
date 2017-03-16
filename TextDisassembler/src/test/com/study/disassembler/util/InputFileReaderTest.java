package test.com.study.disassembler.util;


import org.junit.Assert;
import org.junit.Test;
import com.study.disassembler.util.InputFileReader;

public class InputFileReaderTest {
	@Test
	public void readInputPositiveTest(){
		String input = InputFileReader.readInput();
		Assert.assertFalse(input.isEmpty());
	}
}
