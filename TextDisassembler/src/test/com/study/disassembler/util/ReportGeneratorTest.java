package test.com.study.disassembler.util;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.study.disassembler.action.LexemeSorter;
import com.study.disassembler.composite.TextCompositeHandler;
import com.study.disassembler.parser.ParserEnum;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.parsermanager.CompositePopulator;
import com.study.disassembler.util.Constants;
import com.study.disassembler.util.InputFileReader;
import com.study.disassembler.util.ReportGenerator;



public class ReportGeneratorTest {
	private String input;
	private TextCompositeHandler handler;
	private TextComponentParser parser;
	private ArrayList<Entry<String, Integer>> result;
	@Before
	public void initalizeCompositeObjectPrerequisites(){
		input = InputFileReader.readInput();
		handler = new TextCompositeHandler();
		ParserEnum item = ParserEnum.valueOf(Constants.TOP_LEVEL_PARSER);
		parser = item.getParser();
		handler.setCompositeTextObject(CompositePopulator.populateCompositeObject(input, parser, handler.getCompositeTextObject()));
		result = LexemeSorter.getSortedLexemeMap(handler);
	}
	
	@Test
	public void printReportTest(){
		Assert.assertTrue(ReportGenerator.printReport(result));
	}
	
}
