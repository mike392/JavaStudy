package test.com.study.tune.action;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.study.tune.action.TuneList;
import com.study.tune.action.TuneListGenreSorter;
import com.study.tune.action.TuneListPopulator;
import com.study.tune.entity.Tune;
import com.study.tune.util.InputFileReader;

public class TuneListGenreSorterTest {
	private List<String> inputFromFile = new LinkedList<String>();
	@Before
	public void initInputFromFile(){
		this.inputFromFile = InputFileReader.readInput();
	}
	@Test
	public void sortListAscTest(){
		TuneListPopulator.populateTuneListGivenInput(inputFromFile);
		List<Tune> unsortedList = TuneList.getTuneList();
		TuneList.setTuneList(TuneListGenreSorter.sortListAsc(TuneList.getTuneList()));
		List<Tune> sortedList = TuneList.getTuneList();
		boolean result = true;
		for (int i = 0; i < sortedList.size(); i++){
			if (!sortedList.get(i).equals(unsortedList.get(i))){
				result = false;
				}
		}
		Assert.assertFalse(result);
	}
	
}
