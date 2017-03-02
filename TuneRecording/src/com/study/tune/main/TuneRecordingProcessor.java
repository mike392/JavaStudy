package com.study.tune.main;

import java.util.List;
import com.study.tune.action.TuneList;
import com.study.tune.action.TuneListGenreSorter;
import com.study.tune.action.TuneListPopulator;
import com.study.tune.action.TuneWithinDurationRangeFinder;
import com.study.tune.entity.Tune;
import com.study.tune.util.Constants;
import com.study.tune.util.InputFileReader;
import com.study.tune.util.ReportPrinter;

public class TuneRecordingProcessor {
	public static void main(String[] args) {
		List<String> input = InputFileReader.readInput();
		TuneListPopulator.populateTuneListGivenInput(input);
		TuneList.setTuneList(TuneListGenreSorter.sortListAsc(TuneList.getTuneList()));
		List<Tune> finderResult = TuneWithinDurationRangeFinder.findTuneListWithinGivenRange(TuneList.getTuneList(), Constants.DURATION_UPPER_BORDER, Constants.DURATION_LOWER_BORDER);
		ReportPrinter.printReport(finderResult);
	}
}
