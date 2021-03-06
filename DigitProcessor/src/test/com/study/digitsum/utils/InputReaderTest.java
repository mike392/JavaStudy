package test.com.study.digitsum.utils;

import org.junit.Test;
import static org.mockito.Mockito.*;
import com.study.digitsum.utils.InputIdentifier;
import com.study.digitsum.utils.InputReader;
import com.study.digitsum.utils.impl.InputConsoleReader;
import org.powermock.api.mockito.PowerMockito;
import org.junit.Assert;

public class InputReaderTest {
	@Test
	public void inputReaderConsoleReadPositive(){
		String[] input = {"234"};
		InputReader reader = InputIdentifier.getReader(input);
		Long result = 234L;
		Assert.assertEquals(result, reader.readInput().get(0));
	}
	
	@Test
	public void inputReaderConsoleReadNegative(){
		String[] input = {};
		InputReader reader = new InputConsoleReader(input);
		boolean result = reader.readInput().size() > 0;
		Assert.assertFalse(result);
	}
}
