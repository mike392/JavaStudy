package com.study.disassembler.parser.impl;

import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.util.RegExp;

import java.util.regex.Pattern;

import com.study.disassembler.parser.AbstractParser;

public class PunctParser extends AbstractParser implements TextComponentParser {

	public PunctParser(){
		setPattern(Pattern.compile(RegExp.PUNCT_PATTERN));
	}
	@Override
	public TextComponentParser getSuccessor() {
		// TODO Auto-generated method stub
		return null;
	}

}
