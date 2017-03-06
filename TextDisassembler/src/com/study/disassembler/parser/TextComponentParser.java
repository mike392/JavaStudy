package com.study.disassembler.parser;

public interface TextComponentParser {
	public abstract boolean hasSuccesor();
	public abstract TextComponentParser getSuccessor();
	public abstract String parseTextComponent(String component);
}
