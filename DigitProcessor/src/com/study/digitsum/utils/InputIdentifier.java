package com.study.digitsum.utils;

import com.study.digitsum.utils.impl.InputConsoleReader;
import com.study.digitsum.utils.impl.InputFileReader;

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
