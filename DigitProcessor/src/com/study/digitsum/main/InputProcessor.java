package com.study.digitsum.main;

import java.util.LinkedList;
import java.util.List;

import com.study.digitsum.digitprocessor.DigitProcessor;
import com.study.digitsum.utils.Constants;

public class InputProcessor {
	
	public static List<String> generateOutput(List<Long> input){
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
