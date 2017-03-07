package com.study.disassembler.parser;

import java.util.regex.Pattern;

public abstract class AbstractParser{
	private TextComponentParser successor;
	private Pattern pattern;
	private String endSymbol;

	public TextComponentParser getSuccessor() {
		return successor;
	}

	public void setSuccessor(TextComponentParser successor) {
		this.successor = successor;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

	public String getEndSymbol() {
		return endSymbol;
	}

	public void setEndSymbol(String endSymbol) {
		this.endSymbol = endSymbol;
	}

}
