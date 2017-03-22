package com.study.disassembler.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class InputFileReader {
	static Logger logger = LogManager.getLogger(InputFileReader.class);
	public static String readInput(){
		String input = null;
		File file = new File(Constants.INPUT_PATH);
		try(Scanner scanner = new Scanner(file)) {
			byte[] inputBytes = Files.readAllBytes(Paths.get(Constants.INPUT_PATH));
			input = new String(inputBytes, StandardCharsets.UTF_8);
		} catch (IOException e) {
			logger.fatal("Problem reading file at the following the path - " + Constants.INPUT_PATH);
			throw new RuntimeException(e);
		}
		return input;
	}
	

}
