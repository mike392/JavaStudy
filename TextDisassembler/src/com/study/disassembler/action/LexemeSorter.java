package com.study.disassembler.action;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import com.study.disassembler.composite.TextComponent;
import com.study.disassembler.composite.TextComposite;
import com.study.disassembler.composite.TextCompositeHandler;
import com.study.disassembler.parser.ParserEnum;


public class LexemeSorter {
	public static ArrayList<Entry<String, Integer>> getSortedLexemeMap(TextCompositeHandler handler){
		HashMap<String, Integer> unsortedResult = new HashMap<String, Integer>();
		unsortedResult = constructRawLexemeMap(unsortedResult, handler.getCompositeTextObject());
		ArrayList<Entry<String, Integer>> sortedList = new ArrayList<Entry<String, Integer>>(unsortedResult.entrySet());
		sortedList.sort(Comparator.comparing(Entry<String, Integer>::getValue).reversed()
								.thenComparing(Entry<String, Integer>::getKey));
		return sortedList;
	}

	private static HashMap<String, Integer> constructRawLexemeMap(HashMap<String, Integer> input, TextComponent component) {
		if (component instanceof TextComposite){
			for (TextComponent item : ((TextComposite) component).getComponents()){
				if (item.getComponentType() != ParserEnum.WORD){
					constructRawLexemeMap(input, item);
				} else {
					String word = item.toString().trim();
					if (input.containsKey(word)){
						Integer count = new Integer(input.get(word).intValue() + 1);
						input.put(word, count);
						
					} else {
						input.put(word, 1);
					}
				}
				
			}
		}		
		return input;
	} 
}