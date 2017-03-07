package com.study.disassembler.composite;

public class TextCompositeHandler {
	private TextComponent compositeTextObject;
	
	public TextCompositeHandler(){
		compositeTextObject = new TextComposite();
	}
	
	public TextComponent getCompositeTextObject() {
		return compositeTextObject;
	}

	public void setCompositeTextObject(TextComponent compositeTextObject) {
		this.compositeTextObject = compositeTextObject;
	}
}
