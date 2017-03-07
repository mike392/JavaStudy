package com.study.disassembler.composite;

public class TextLeafElement extends TextComponent {
	private String textItem;
	@Override
	public String toString() {
		return textItem;
	}

	public void setTextItem(String string) {
		this.textItem = string;
	}
	@Override
	public void addComponent(TextComponent component) {
		throw new UnsupportedOperationException();
	}

}
