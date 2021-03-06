package test.com.study.tune.action;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.study.tune.action.TuneList;
import com.study.tune.action.TuneListPopulator;
import com.study.tune.util.InputFileReader;

public class TuneListPopulatorTest {
	private List<String> inputFromFile = new LinkedList<String>();
	@Before
	public void initInputFromFile(){
		this.inputFromFile = InputFileReader.readInput();
	}	
	@Test
	public void populateTuneListGivenInputTest(){
		TuneListPopulator.populateTuneListGivenInput(inputFromFile);
		Assert.assertFalse(TuneList.getTuneList().isEmpty());
	}
}
