package com.study.disassembler.composite;

public class TextLeafPunctElement extends TextComponent {
	private String punctItem;
	@Override
	public String toString() {
		return punctItem;
	}

	@Override
	public void addComponent(TextComponent component) {
		throw new UnsupportedOperationException();
	}

	public void setPunctItem(String punctItem) {
		this.punctItem = punctItem;
	}

}
