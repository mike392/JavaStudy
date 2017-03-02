package com.study.tune.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.study.tune.entity.Tune;
import com.study.tune.main.TuneRecordingProcessor;

public class ReportPrinter {
	static Logger logger = LogManager.getLogger(ReportPrinter.class);
	public static boolean printReport(List<Tune> inputList) {
		boolean output = false; 
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (Tune item : inputList){
				String result = "Duration of " + item.getClass().getSimpleName() + " is - " + item.getDuration() + " Genre of tune is - " + item.getGenre().toString() + " and the tune type is " + item.getTuneType().toString();;
				writer.write(result + "\n");
			}
			output = true;
		} catch (IOException e) {
			logger.log(Level.ERROR, "Error when writing to output file - " + Constants.OUTPUT_PATH);
		}
		return output;
	}

}
