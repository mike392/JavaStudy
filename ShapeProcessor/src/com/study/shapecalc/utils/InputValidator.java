package com.study.shapecalc.utils;

import java.util.LinkedList;
import java.util.List;

public class InputValidator {
	
	public static List<Double> validateInput(List<String> input){
		List<Double> result = new LinkedList<Double>();
		for (String item : input){
			if (isPositiveDouble(item)){
				result.add(Double.parseDouble(item));
			}
		}
		return result;	
	}
	
	private static boolean isPositiveDouble(String input){
		boolean result = false;
		try {
			double value = Double.parseDouble(input);
			if (value > 0){
				result = true;
			}
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
		return result;
	}
}
