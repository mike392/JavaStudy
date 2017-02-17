package com.study.calculator.digitsum.utils.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.study.calculator.digitsum.utils.Constants;
import com.study.calculator.digitsum.utils.InputReader;
import com.study.calculator.digitsum.utils.InputValidator;

public class InputFileReader implements InputReader {

	public List<Long> readInput(){
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
