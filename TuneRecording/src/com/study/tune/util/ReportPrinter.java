package com.study.tune.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.Level;
import com.study.tune.entity.Tune;
import com.study.tune.main.TuneRecordingProcessor;

public class ReportPrinter {

	public static void printReport(List<Tune> inputList) {
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (Tune item : inputList){
				String result = "Duration of " + item.getClass().getSimpleName() + " is - " + item.getDuration() + " Genre of tune is - " + item.getGenre().toString() + " and the tune type is " + item.getTuneType().toString();;
				writer.write(result + "\n");
			}
		} catch (IOException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, "Error when writing to output file - " + Constants.OUTPUT_PATH);
		}
		
	}

}
