package com.study.digitsum.main;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.study.digitsum.utils.InputIdentifier;
import com.study.digitsum.utils.InputReader;
import com.study.digitsum.utils.ReportGenerator;


public class Calculator {
	public static Logger logger = LogManager.getLogger(Calculator.class);
	public static void main(String[] args){
		InputReader reader = InputIdentifier.getReader(args);
		List<Long> input = reader.readInput();
		List<String> output = InputProcessor.generateOutput(input);
		ReportGenerator.printReport(output);
	}
}
