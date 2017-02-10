package com.study.calculator.shapecalc.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class InputReader {
	
	public List<String> readInput() throws IOException{
		List<String> inputArgs = null;
		File file = new File(Constants.inputPath);
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()){
			if (scanner.hasNextDouble()){
				inputArgs.add(scanner.next());
			}
		}
		return inputArgs;
	}
}
