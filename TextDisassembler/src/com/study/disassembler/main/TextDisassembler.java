package com.study.disassembler.main;

import com.study.disassembler.composite.TextCompositeHandler;
import com.study.disassembler.parser.ParserEnum;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.parsermanager.CompositePopulator;
import com.study.disassembler.util.Constants;
import com.study.disassembler.util.InputFileReader;

public class TextDisassembler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = InputFileReader.readInput();
		TextCompositeHandler handler = new TextCompositeHandler();
		ParserEnum item = ParserEnum.valueOf(Constants.TOP_LEVEL_PARSER);
		TextComponentParser parser = item.getParser();
		handler.setCompositeTextObject(CompositePopulator.populateCompositeObject(input, parser, handler.getCompositeTextObject()));
		System.out.println("1");
	}

}
