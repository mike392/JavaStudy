package com.study.digitsum.utils;

import java.util.LinkedList;
import java.util.List;

public class InputValidator {
	
	public static List<Long> validateInput(List<String> input){
		List<Long> result = new LinkedList<Long>();
		for (String item : input){
			if (isLong(item)){
				result.add(Long.parseLong(item));
			}
		}
		return result;	
	}
	
	private static boolean isLong(String input){
		boolean result = false;
		try {
			Long.parseLong(input);
			result = true;
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
		return result;
	}
}
