package com.study.disassembler.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.study.tune.util.Constants;
import com.study.tune.util.ReportPrinter;

public class ReportGenerator {
	static Logger logger = LogManager.getLogger(ReportGenerator.class);
	public static boolean printReport(List<Entry<String, Integer>> input){
		boolean output = false;
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (Entry item : input){
				writer.write("Lexeme - " + item.getKey().toString() + " - occured " + item.getValue().toString() + " times" + "\n");
			}
			output = true;
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error when writing to output file - " + Constants.OUTPUT_PATH);
		}
		return output;
	}
	
}
