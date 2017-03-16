package test.com.study.disassembler.action;

import java.util.ArrayList;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.study.disassembler.action.LexemeSorter;
import com.study.disassembler.composite.TextComposite;
import com.study.disassembler.composite.TextCompositeHandler;
import com.study.disassembler.parser.ParserEnum;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.parsermanager.CompositePopulator;
import com.study.disassembler.util.Constants;
import com.study.disassembler.util.InputFileReader;

public class LexemeSorterTest {
	private String input;
	private TextCompositeHandler handler;
	private TextComponentParser parser;
	@Before
	public void initalizeCompositeObjectPrerequisites(){
		input = InputFileReader.readInput();
		handler = new TextCompositeHandler();
		ParserEnum item = ParserEnum.valueOf(Constants.TOP_LEVEL_PARSER);
		parser = item.getParser();
		handler.setCompositeTextObject(CompositePopulator.populateCompositeObject(input, parser, handler.getCompositeTextObject()));
	}
	
	@Test
	public void getSortedLexemeMapPositiveTest(){
		ArrayList<Entry<String, Integer>> result = LexemeSorter.getSortedLexemeMap(handler);
		Assert.assertFalse(result.isEmpty());
	}
	
	@Test
	public void getSortedLexemeMapNegativeTest(){
		handler.setCompositeTextObject(new TextComposite());
		ArrayList<Entry<String, Integer>> result = LexemeSorter.getSortedLexemeMap(handler);
		Assert.assertTrue(result.isEmpty());
	}
}
