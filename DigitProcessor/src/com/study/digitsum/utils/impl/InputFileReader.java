package com.study.digitsum.utils.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.Level;

import com.study.digitsum.main.Calculator;
import com.study.digitsum.utils.Constants;
import com.study.digitsum.utils.InputReader;
import com.study.digitsum.utils.InputValidator;

public class InputFileReader implements InputReader {

	public List<Long> readInput(){
		List<String> inputArgs = new LinkedList<String>();
		File file = new File(Constants.INPUT_PATH);
		try(Scanner scanner = new Scanner(file)) {
			while (scanner.hasNext()){
				inputArgs.add(scanner.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Calculator.logger.log(Level.ERROR, "No file was found following the path - " + Constants.INPUT_PATH);
			e.printStackTrace();
		}

		return InputValidator.validateInput(inputArgs);
	}
	

}
