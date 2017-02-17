package com.study.digitsum.utils;

import com.study.digitsum.utils.impl.InputConsoleReader;
import com.study.digitsum.utils.impl.InputFileReader;

public class InputIdentifier {
	
	private String[] inputParameters;
	
	public InputIdentifier(String[] args){
		inputParameters = args;
	}
	
	public InputReader getReader(){
		InputReader reader = null;
		if (inputParameters.length > 0){
			reader = new InputConsoleReader(inputParameters);
		} else {
			reader = new InputFileReader();
		}
		return reader; 
	}

}