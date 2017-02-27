package test.com.study.tune.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.com.study.tune.action.TuneListGenreSorterTest;
import test.com.study.tune.action.TuneListPopulatorTest;
import test.com.study.tune.util.InputFileReaderTest;

@Suite.SuiteClasses(value = { 	InputFileReaderTest.class,
								TuneListPopulatorTest.class,
								TuneListGenreSorterTest.class})
@RunWith(Suite.class)
public class TuneRecordingProcessorTest {
	
}
