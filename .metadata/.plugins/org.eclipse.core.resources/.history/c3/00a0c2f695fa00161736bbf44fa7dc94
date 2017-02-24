package com.study.tune.action;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.logging.log4j.Level;
import com.study.tune.entity.Tune;
import com.study.tune.main.TuneRecordingProcessor;
import com.study.tune.util.Constants;

public class TuneTypePopulator  {
	
	public static <T extends Tune, E> void populateTuneType(T input, String value){
		Object result = null;
		Field field = retrieveEnumField(input);
		if (field == null){
			if (isInt(value)){
				result = Integer.parseInt(value);
			}
		} else {
			result = getEnumValue(field, value);
		}
		
		Method method = retrieveSetter(input);
		try {
			method.invoke(input, result);
		} catch (IllegalAccessException e) {
			TuneRecordingProcessor.logger.log(Level.WARN, "Illegal access error - " + e.getMessage());
		} catch (IllegalArgumentException e) {
			TuneRecordingProcessor.logger.log(Level.WARN, "Illegal argument error - " + e.getMessage());
		} catch (InvocationTargetException e) {
			TuneRecordingProcessor.logger.log(Level.WARN, "Invocation target error - " + e.getMessage());
		}
	}

	private static Object getEnumValue(Field field, String value) {
		Object result = null;
		for (Object enumValue : field.getType().getEnumConstants()){
			if (enumValue.toString().equals(value)){
				result = enumValue;
			}
		}
		if (result == null){
			for (Object enumValue : field.getType().getEnumConstants()){
				if (enumValue.toString().equals(Constants.MISSING_ENUM_VALUE)){
					result = enumValue;
				}
			}
			TuneRecordingProcessor.logger.log(Level.WARN, "Wrong tune type was entered - " + value);
		}
		return result;
	}

	private static <T> Method retrieveSetter(T input) {
		Method result = null;
		Method[] methodList = input.getClass().getDeclaredMethods();
		for (Method item : methodList){
			if (Modifier.isPublic(item.getModifiers()) && item.getParameterTypes().length > 0 && item.getName().matches("^set[A-Z].*")){
				result = item;
			}
		}
		return result;
	}

	private static <T> Field retrieveEnumField(T input) {
		Field field = null;
		Class<?> clazz = input.getClass();
		Field[] fieldArray = clazz.getDeclaredFields();
		for (Field item : fieldArray){
			if (item.getType().isEnum()) {
				field = item;
			}
		} 
		return field;
	}
	
	private static boolean isInt(String input) {
		boolean result = false;
		try {
			Integer.parseInt(input);
			result = true;
		} catch(NumberFormatException e){
			TuneRecordingProcessor.logger.log(Level.WARN, "The input for tune type is not a number - " + input);
		}
		return result;
	}
}
