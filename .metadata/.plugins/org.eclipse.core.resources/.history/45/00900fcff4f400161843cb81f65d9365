package com.study.abiturient.abiturientlist.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class InputDataMapGenerator {
	
	public static HashMap<String, String> generateListWithMarks(){
		HashMap<String, String> result = new HashMap<String, String>();
		try {
			FileReader reader = new FileReader(Constants.INPUT_PATH);
			BufferedReader br = new BufferedReader(reader);
			for (Object line : br.lines().toArray()){
				String[] values = ((String) line).split(Constants.DELIMITER + "+");
				result.put(values[0], values[1]);
			}
			br.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
