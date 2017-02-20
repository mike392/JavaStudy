package com.study.digitsum.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Level;

import com.study.digitsum.main.Calculator;

public class ReportGenerator {
	
	public static void printReport(List<String> input){
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (String line : input){
				writer.write(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Calculator.logger.log(Level.ERROR, "Error occured while priniting report - " + e.getMessage());
		}

	}
	
}
