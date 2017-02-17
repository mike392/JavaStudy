package com.study.calculator.shapecalc.utils.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.study.calculator.shapecalc.utils.Constants;
import com.study.calculator.shapecalc.utils.InputReader;
import com.study.calculator.shapecalc.utils.InputValidator;

public class InputFileReader implements InputReader {

	public List<Double> readInput(){
		List<String> inputArgs = new LinkedList<String>();
		File file = new File(Constants.INPUT_PATH);
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()){
				inputArgs.add(scanner.next());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return InputValidator.validateInput(inputArgs);
	}
	

}
