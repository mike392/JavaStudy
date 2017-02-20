package com.study.shapecalc.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
	
	public static void printReport(List<String> input){
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (String line : input){
				writer.write(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
