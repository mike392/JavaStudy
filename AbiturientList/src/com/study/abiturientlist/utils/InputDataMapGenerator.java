package com.study.abiturientlist.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class InputDataMapGenerator {
	
	public static HashMap<String, String> generateListWithMarks(){
		HashMap<String, String> result = new HashMap<String, String>();
		try(FileReader reader = new FileReader(Constants.INPUT_PATH);
			BufferedReader br = new BufferedReader(reader)) {
			for (Object line : br.lines().toArray()){
				String[] values = ((String) line).split(Constants.DELIMITER + "+");
				result.put(values[0], values[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
