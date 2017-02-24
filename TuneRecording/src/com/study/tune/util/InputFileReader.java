package com.study.tune.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.Level;

import com.study.tune.util.Constants;
import com.study.tune.util.InputValidator;
import com.study.tune.main.TuneRecordingProcessor;

public class InputFileReader {

	public static List<String> readInput(){
		List<String> inputArgs = new LinkedList<String>();
		File file = new File(Constants.INPUT_PATH);
		try(Scanner scanner = new Scanner(file).useDelimiter(Constants.ROW_DELIMITER)) {
			while (scanner.hasNext()){
				inputArgs.add(scanner.next());
			}
		} catch (FileNotFoundException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, "No file was found following the path - " + Constants.INPUT_PATH);
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		}
		List<String> result = InputValidator.getValidatedInput(inputArgs);
		return result;
	}
	

}
