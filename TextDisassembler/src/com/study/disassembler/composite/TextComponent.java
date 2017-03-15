package com.study.disassembler.composite;

import com.study.disassembler.parser.ParserEnum;

public abstract class TextComponent {
	private String delimiter;
	private ParserEnum componentType;
	public abstract String toString();
	public abstract void addComponent(TextComponent component);
	public String getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
	public ParserEnum getComponentType() {
		return componentType;
	}
	public void setComponentType(ParserEnum componentType) {
		this.componentType = componentType;
	}
}
