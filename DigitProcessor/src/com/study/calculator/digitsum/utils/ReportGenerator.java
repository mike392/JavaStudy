package com.study.calculator.digitsum.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
	
	private List<String> input;
	
	public ReportGenerator(List<String> input){
		this.input = input;
	}
	
	public void printReport() throws IOException{
		FileWriter writer = new FileWriter(Constants.OUTPUT_PATH);
		for (String line : input){
			writer.write(line);
		}
		writer.close();
	}
	
}
