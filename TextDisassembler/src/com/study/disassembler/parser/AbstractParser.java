package com.study.disassembler.parser;

import java.util.regex.Pattern;

public class AbstractParser{
	private TextComponentParser successor;
	private Pattern pattern;
	private String startSymbol;
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

	public String getStartSymbol() {
		return startSymbol;
	}

	public void setStartSymbol(String startSymbol) {
		this.startSymbol = startSymbol;
	}

	public String getEndSymbol() {
		return endSymbol;
	}

	public void setEndSymbol(String endSymbol) {
		this.endSymbol = endSymbol;
	}

}
