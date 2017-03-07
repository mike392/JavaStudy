package com.study.disassembler.parser.impl;

import java.util.regex.Pattern;

import com.study.disassembler.parser.AbstractParser;
import com.study.disassembler.parser.ParserEnum;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.util.Constants;

public class ParagraphParser extends AbstractParser implements TextComponentParser {

	public ParagraphParser(){
		setPattern(Pattern.compile(Constants.PARAGRAPH_PATTERN));
		setEndSymbol(Constants.PARAGRAPH_START_END_SYMBOL);
	}
	@Override
	public TextComponentParser getSuccessor() {
		// TODO Auto-generated method stub
		return ParserEnum.SENTENCE.getParser();
	}
}
