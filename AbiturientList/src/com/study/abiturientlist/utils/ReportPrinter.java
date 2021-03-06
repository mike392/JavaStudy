package com.study.abiturientlist.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.study.abiturientlist.abiturient.Abiturient;


public class ReportPrinter {
	public static void printReport(List<Abiturient> inputList){
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (Abiturient item : inputList){
				writer.write("Student name = " + item.getName() + " he has mark = " + item.getMark() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
