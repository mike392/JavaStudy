package com.study.disassembler.parser.impl;

import java.util.regex.Pattern;

import com.study.disassembler.parser.AbstractParser;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.util.RegExp;

public class SymbolParser extends AbstractParser implements TextComponentParser {

	public SymbolParser(){
		setPattern(Pattern.compile(RegExp.SYMBOL_PATTERN));

	}
	@Override
	public TextComponentParser getSuccessor() {
		// TODO Auto-generated method stub
		return null;
	}

}
