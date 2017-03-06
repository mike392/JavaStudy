package com.study.disassembler.parser.impl;

import java.util.regex.Pattern;

import com.study.disassembler.parser.TextComponentParser;
import com.study.disassembler.util.Constants;

public class WordParser implements TextComponentParser {

	@Override
	public boolean hasSuccesor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TextComponentParser getSuccessor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parseTextComponent(String component) {
		// TODO Auto-generated method stub
		Pattern pt = Pattern.compile(Constants.WORD_PATTERN);
		return pt.matcher(component).group(2);
	}

}
