package com.study.calculator.shapecalc.main;

import com.study.calculator.shapecalc.utils.InputIdentifier;
import com.study.calculator.shapecalc.utils.InputReader;
import com.study.calculator.shapecalc.utils.ReportGenerator;

public class ParamsCalculator {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		InputIdentifier identifier = new InputIdentifier(args);
		InputReader reader = identifier.getReader();
		InputProcessor processor = new InputProcessor(reader.readInput());
		ReportGenerator report = new ReportGenerator(processor.generateOutput());
		report.printReport();
	}
	
}
