package com.study.abiturientlist.utils;

public class MarksListValidator {

	public static boolean isAlphaString(Object value) {
		boolean result = true;
		String stringValue = (String) value;
		for (int i = 0; i < stringValue.length(); i++){
			char ñ = stringValue.charAt(i);
			if (!Character.isLetter(ñ)){
				result = false;
			}
		}
		return result;
	}

	public static boolean isPositiveInt(Object value) {
		boolean result = false;
		try {
			int parsedValue = Integer.parseInt((String) value);
			if (parsedValue >= 0){
				result = true;
			}
		} catch(NumberFormatException e){
			e.printStackTrace();
		}
		return result; 
	}

}
