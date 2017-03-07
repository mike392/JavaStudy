package com.study.disassembler.parser.impl;

import java.util.regex.Pattern;

import com.study.disassembler.parser.AbstractParser;
import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.util.Constants;

public class CharacterParser extends AbstractParser implements TextComponentParser {
	public CharacterParser(){
		setPattern(Pattern.compile(Constants.PUNCT_PATTERN));
	}
}