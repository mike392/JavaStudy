package com.study.calculator.digitsum.main;

import java.util.LinkedList;
import java.util.List;

import com.study.calculator.digitsum.digitprocessor.DigitProcessor;
import com.study.calculator.digitsum.utils.Constants;

public class InputProcessor {
	
	private List<Long> input;
	
	public InputProcessor(List<Long> list){
		this.input = list;
	}
	
	public List<String> generateOutput(){
		List<String> output = new LinkedList<String>();
		if (input.size() == 0){
			output.add(Constants.WRONG_OUTPUT_MESSAGE);
		} else {
			for (Long item : input){
				DigitProcessor processor = new DigitProcessor();
				long computeResult = processor.getSumOfDigits(item.longValue());
				output.add("Digit " + item.longValue() + " has sum of digits " + computeResult + "\n");
			}
		}
		return output;
	}

}