package test.com.study.tune.action;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.study.tune.action.TuneList;
import com.study.tune.action.TuneListGenreSorter;
import com.study.tune.action.TuneListPopulator;
import com.study.tune.action.TuneWithinDurationRangeFinder;
import com.study.tune.entity.Tune;
import com.study.tune.util.Constants;
import com.study.tune.util.InputFileReader;
import com.study.tune.util.ReportPrinter;

public class ReportPrinterTest {
	private List<Tune> finderResult = new ArrayList<Tune>();
	@Before
	public void initializeSortAndFilterTuneList(){
		List<String> input = InputFileReader.readInput();
		TuneListPopulator.populateTuneListGivenInput(input);
		List<Tune> unsortedList = TuneList.getTuneList();
		List<Tune> sortedList = TuneListGenreSorter.sortListAsc(unsortedList);
		TuneList.setTuneList(sortedList);
		finderResult = TuneWithinDurationRangeFinder.findTuneListWithinGivenRange(TuneList.getTuneList(), Constants.DURATION_UPPER_BORDER, Constants.DURATION_LOWER_BORDER);
	}
	
	@Test
	public void printReportTest(){
		Assert.assertTrue(ReportPrinter.printReport(finderResult));
	}

}
