package com.study.calculator.digitsum.utils.impl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.study.calculator.digitsum.utils.InputReader;
import com.study.calculator.digitsum.utils.InputValidator;

public class InputConsoleReader implements InputReader{
	private final String[] inputParameters;
	public InputConsoleReader(String[] inputParameters){
		this.inputParameters = inputParameters;
	}

	public List<Long> readInput(){
		List<String> inputArgs = new LinkedList<String>(Arrays.asList(inputParameters));
		return InputValidator.validateInput(inputArgs);
	}
	
}
