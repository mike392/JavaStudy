package com.study.calculator.shapecalc.utils;

import java.io.FileWriter;
import java.io.IOException;

public class OutputGenerator {
	public static void printReport(String output) throws IOException{
		FileWriter writer = new FileWriter(Constants.outputPath);
		writer.write(output);
		writer.close();
	}
	
	public static void printReport(String[] output) throws IOException{
		FileWriter writer = new FileWriter(Constants.outputPath);
		for (String line : output){
			writer.write(line);			
		}
		writer.close();
	}
}
