package com.study.digitsum.main;

import java.util.List;

import com.study.digitsum.utils.InputIdentifier;
import com.study.digitsum.utils.InputReader;
import com.study.digitsum.utils.ReportGenerator;


public class Calculator {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		InputReader reader = InputIdentifier.getReader(args);
		List<Long> input = reader.readInput();
		List<String> output = InputProcessor.generateOutput(input);
		ReportGenerator.printReport(output);
	}
}
