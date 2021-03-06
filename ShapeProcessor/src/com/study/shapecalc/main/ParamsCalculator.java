package com.study.shapecalc.main;

import java.util.List;

import com.study.shapecalc.utils.InputIdentifier;
import com.study.shapecalc.utils.InputReader;
import com.study.shapecalc.utils.ReportGenerator;

public class ParamsCalculator {

	public static void main(String[] args){
		InputReader reader = InputIdentifier.getReader(args);
		List<Double> input = reader.readInput();
		List<String> output = InputProcessor.generateOutput(input);
		ReportGenerator.printReport(output);
	}
	
}
