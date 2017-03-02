package test.com.study.tune.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.study.tune.action.TuneList;
import com.study.tune.action.TuneListGenreSorter;
import com.study.tune.action.TuneListPopulator;
import com.study.tune.action.TuneWithinDurationRangeFinder;
import com.study.tune.entity.Tune;
import com.study.tune.util.InputFileReader;

import org.junit.Assert;

public class TuneWithinDurationRangeFinderTest {
	@Before
	public void initializaeAndSortTuneList(){
		List<String> input = InputFileReader.readInput();
		TuneList.setTuneList(new ArrayList<Tune>());
		TuneListPopulator.populateTuneListGivenInput(input);
		List<Tune> unsortedList = TuneList.getTuneList();
		List<Tune> sortedList = TuneListGenreSorter.sortListAsc(unsortedList);
		TuneList.setTuneList(sortedList);
	} 
	
	@Test
	public void findTuneListWithinGivenRangePositiveTest(){
		List<Tune> finderResult = TuneWithinDurationRangeFinder.findTuneListWithinGivenRange(TuneList.getTuneList(), 22, 10);
		int expected = 5;
		int actual = finderResult.size();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void findTuneListWithinGivenRangeNegativeTest(){
		List<Tune> finderResult = TuneWithinDurationRangeFinder.findTuneListWithinGivenRange(TuneList.getTuneList(), 24, 25);
		Assert.assertTrue(finderResult.isEmpty());
	}
}
