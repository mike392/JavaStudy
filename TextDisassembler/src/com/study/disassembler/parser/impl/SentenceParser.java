package com.study.disassembler.parser.impl;

import java.util.regex.Pattern;

import com.study.disassembler.parser.AbstractParser;
import com.study.disassembler.parser.ParserEnum;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.util.Constants;

public class SentenceParser extends AbstractParser implements TextComponentParser {

	public SentenceParser(){
		setPattern(Pattern.compile(Constants.SENTENCE_PATTERN));
		setStartSymbol(Constants.STANDARD_START_END_SYMBOL);
		setEndSymbol(Constants.STANDARD_START_END_SYMBOL);
	}

	@Override
	public TextComponentParser getSuccessor() {
		// TODO Auto-generated method stub
		return ParserEnum.WORD.getParser();
	}

}
