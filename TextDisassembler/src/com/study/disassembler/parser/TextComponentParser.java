package com.study.disassembler.parser;

public interface TextComponentParser {
	public default boolean hasSuccesor(){
		return (getSuccessor() != null) ? true : false;
		};
	public abstract TextComponentParser getSuccessor();
}
