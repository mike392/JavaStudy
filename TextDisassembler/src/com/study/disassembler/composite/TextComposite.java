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
	
	public void addComponent(TextComponent component){
		components.add(component);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (TextComponent component : components){
			result.append(component.toString()); 
		}
		result = new StringBuilder(result.toString().trim());
		result.append((getDelimiter() == null) ? "" : getDelimiter());
		return result.toString();
	}
}
