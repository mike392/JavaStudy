package com.study.tune.util;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.Level;
import com.study.tune.entity.Tune;
import com.study.tune.main.TuneRecordingProcessor;

public class ReportPrinter {
	public static void printReport(List<Tune> inputList){
		try(FileWriter writer = new FileWriter(Constants.OUTPUT_PATH)) {
			for (Tune item : inputList){
				String result = "";
				List<Field> fieldsList = new LinkedList<Field>(Arrays.asList(item.getClass().getDeclaredFields()));
				fieldsList.addAll(Arrays.asList(item.getClass().getSuperclass().getDeclaredFields()));
				for (Field field : fieldsList){
					field.setAccessible(true);
					try {
						result += "Value for field " + field.getName() + " is " + field.get(item) + " ";
					} catch (IllegalArgumentException e) {
						TuneRecordingProcessor.logger.log(Level.ERROR, "Error when passing arguments during report printing - " + e.getMessage());
					} catch (IllegalAccessException e) {
						TuneRecordingProcessor.logger.log(Level.ERROR, "Error when accessing fields during report printing - " + e.getMessage());
					}
				}
				writer.write(result + "\n");
			}
		} catch (IOException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, "Error when writing to output file - " + Constants.OUTPUT_PATH);
		}
	}
}
