package com.study.calculator.shapecalc.utils;

import com.study.calculator.shapecalc.utils.impl.InputConsoleReader;
import com.study.calculator.shapecalc.utils.impl.InputFileReader;

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
