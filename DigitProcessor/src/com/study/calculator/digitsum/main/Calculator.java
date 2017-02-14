package com.study.calculator.digitsum.main;

import com.study.calculator.digitsum.utils.InputIdentifier;
import com.study.calculator.digitsum.utils.InputReader;
import com.study.calculator.digitsum.utils.ReportGenerator;


public class Calculator {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		InputIdentifier identifier = new InputIdentifier(args);
		InputReader reader = identifier.getReader();
		InputProcessor processor = new InputProcessor(reader.readInput());
		ReportGenerator generator = new ReportGenerator(processor.generateOutput());
		generator.printReport();
	}
}
