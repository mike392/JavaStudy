package com.study.shapecalc.utils;

import com.study.shapecalc.utils.impl.InputConsoleReader;
import com.study.shapecalc.utils.impl.InputFileReader;

public class InputIdentifier {
	
	public static InputReader getReader(String[] inputParameters){
		InputReader reader = null;
		if (inputParameters.length > 0){
			reader = new InputConsoleReader(inputParameters);
		} else {
			reader = new InputFileReader();
		}
		return reader; 
	}

}
