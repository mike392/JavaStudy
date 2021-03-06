package com.study.disassembler.parsermanager;

import java.util.regex.Matcher;

import com.study.disassembler.composite.TextComponent;
import com.study.disassembler.composite.TextComposite;
import com.study.disassembler.composite.TextLeafElement;
import com.study.disassembler.composite.TextLeafPunctElement;
import com.study.disassembler.parser.AbstractParser;
import com.study.disassembler.parser.ParserEnum;
import com.study.disassembler.parser.TextComponentParser;

public class CompositePopulator {
	
	public static TextComponent populateCompositeObject(String input, TextComponentParser parser, TextComponent compositeObject){
		Matcher matcher = ((AbstractParser) parser).getPattern().matcher(input);
		while(matcher.find()){
			TextComponent component = new TextComposite();
			if (parser.hasSuccesor()) {
				component.setDelimiter(((AbstractParser) parser).getEndSymbol());
				component.setComponentType(getParserNameByObject(parser));
				compositeObject.addComponent(component);
				populateCompositeObject(matcher.group(2), parser.getSuccessor(), component);
				} else {
					Matcher punctMatcher = ((AbstractParser) ParserEnum.PUNCT.getParser()).getPattern().matcher(matcher.group(2));
					if (punctMatcher.find()){
						component = new TextLeafPunctElement();
						((TextLeafPunctElement) component).setPunctItem(matcher.group(2));
					} else {
						component = new TextLeafElement();
						((TextLeafElement) component).setTextItem(matcher.group(2));
					}
					compositeObject.addComponent(component);
				}
		}
		return compositeObject;
	}
	
	private static ParserEnum getParserNameByObject(TextComponentParser parser){
		ParserEnum result = null;
		for (ParserEnum item : ParserEnum.values()){
			if (item.getParser().getClass().equals(parser.getClass())){
				result = item;
			}
		}
		return result;
	}
	
}
