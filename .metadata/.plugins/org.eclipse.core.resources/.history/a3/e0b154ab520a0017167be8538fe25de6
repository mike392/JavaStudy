package com.study.disassembler.parsermanager;

import com.study.disassembler.composite.TextComponent;
import com.study.disassembler.composite.TextComposite;

public class TextAssembler {

	public static String composeText(TextComponent component){
		StringBuilder result = new StringBuilder();
		if (component instanceof TextComposite) {
			for (TextComponent innerComponent : ((TextComposite) component).getComponents()){
				result.append(composeText(innerComponent));
			}
		}
		result.append(component.toString());
		return result.toString();
	}
	
}
