package com.study.disassembler.composite;

import java.util.ArrayList;

public class TextComposite extends TextComponent {
	private ArrayList<TextComponent> components = new ArrayList<TextComponent>();

	public ArrayList<TextComponent> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<TextComponent> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
