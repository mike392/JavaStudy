package test.com.study.tune.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.com.study.tune.action.ReportPrinterTest;
import test.com.study.tune.action.TuneListGenreSorterTest;
import test.com.study.tune.action.TuneListPopulatorTest;
import test.com.study.tune.creator.TuneCreatorTest;
import test.com.study.tune.util.InputFileReaderTest;
import test.com.study.tune.util.TuneWithinDurationRangeFinderTest;

@Suite.SuiteClasses(value = { 	InputFileReaderTest.class,
								TuneCreatorTest.class,
								TuneListPopulatorTest.class,
								TuneListGenreSorterTest.class,
								TuneWithinDurationRangeFinderTest.class,
								ReportPrinterTest.class})
@RunWith(Suite.class)
public class TuneRecordingProcessorTest {
	
}
