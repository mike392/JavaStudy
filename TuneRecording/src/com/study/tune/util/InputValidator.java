package com.study.tune.util;

import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.EnumUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.study.tune.entity.TuneGenreEnum;
import com.study.tune.main.TuneRecordingProcessor;

public class InputValidator {
	static Logger logger = LogManager.getLogger(InputValidator.class);
	public static List<String> getValidatedInput(List<String> input){
		List<String> result = new LinkedList<String>();
		for (String item : input){
			if (item.split(Constants.COLUMN_DELIMITER).length == Constants.FIELDS_NUMBER){
				if (isInputItemValid(item))
					result.add(item.trim());
			} else {
				logger.log(Level.WARN, "Wrong amoung of input fields or wrong delimiters - " + item);
			}
		}
		return result;	
	}
	
	private static boolean isInputItemValid(String item){
		boolean result = false;
		String[] itemArray = item.split(Constants.COLUMN_DELIMITER);
		if (isDouble(itemArray[1]) && isValidGenre(itemArray[2])){
			result = true;
		}
		return result;
	}

	private static boolean isDouble(String input) {
		boolean result = false;
		try {
			Double.parseDouble(input);
			result = true;
		} catch(NumberFormatException e){
			logger.log(Level.WARN, "The input is not a number - " + input);
		}
		return result;
	}

	private static boolean isValidGenre(String input) {
		boolean result = false;
		if (EnumUtils.isValidEnum(TuneGenreEnum.class, input.toUpperCase())){
			result = true;
		} else {
			logger.log(Level.WARN, "The input has wrong genre - " + input);
		}
		return result;
	}
}
