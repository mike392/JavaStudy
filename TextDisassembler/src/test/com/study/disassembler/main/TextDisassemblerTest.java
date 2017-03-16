package test.com.study.disassembler.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.com.study.disassembler.action.LexemeSorterTest;
import test.com.study.disassembler.parsermanager.CompositePopulatorTest;
import test.com.study.disassembler.util.InputFileReaderTest;
import test.com.study.disassembler.util.ReportGeneratorTest;

@Suite.SuiteClasses(value = { 	InputFileReaderTest.class,
								CompositePopulatorTest.class,
								LexemeSorterTest.class,
								ReportGeneratorTest.class})
@RunWith(Suite.class)
public class TextDisassemblerTest {
	

}
