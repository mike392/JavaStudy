package com.study.disassembler.composite;

public abstract class TextComponent {
	private String delimiter;
	public abstract String toString();
	public abstract void addComponent(TextComponent component);
	public String getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}
}
