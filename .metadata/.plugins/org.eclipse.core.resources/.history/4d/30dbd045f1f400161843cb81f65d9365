package com.study.calculator.shapecalc.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
	
	private List<String> input;
	
	public ReportGenerator(List<String> input){
		this.input = input;
	}
	
	public void printReport(){
		try {
			FileWriter writer = new FileWriter(Constants.OUTPUT_PATH);
			for (String line : input){
				writer.write(line);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
