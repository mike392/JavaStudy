package com.study.abiturientlist.utils;

public class MarksListValidator {

	public static boolean isAlphaString(Object value) {
		// TODO Auto-generated method stub
		boolean result = true;
		String stringValue = (String) value;
		for (int i = 0; i < stringValue.length(); i++){
			char � = stringValue.charAt(i);
			if (!Character.isLetter(�)){
				result = false;
			}
		}
		return result;
	}

	public static boolean isPositiveInt(Object value) {
		// TODO Auto-generated method stub
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