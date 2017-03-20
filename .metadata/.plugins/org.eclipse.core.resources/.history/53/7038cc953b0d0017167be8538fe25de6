package com.study.disassembler.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;

public class ReportGenerator {
	
	public static boolean printReport(List<Entry<String, Integer>> input){
		boolean output = false;
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (Entry item : input){
				writer.write("Lexeme - " + item.getKey().toString() + " - occured " + item.getValue().toString() + " times" + "\n");
			}
			output = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}
	
}
