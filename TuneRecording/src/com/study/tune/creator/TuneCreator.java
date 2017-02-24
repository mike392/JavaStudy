package com.study.tune.creator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.logging.log4j.Level;

import com.study.tune.main.TuneRecordingProcessor;
import com.study.tune.util.Constants;

public class TuneCreator {
	
	public static Object createTuneBasedOnType(String type){
		Object result = new Object();
		try {
			Constructor<?> tuneConstructor = Class.forName(Constants.PACKAGE_NAME + type).getConstructor();
			result = tuneConstructor.newInstance();
		} catch (NoSuchMethodException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (SecurityException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (ClassNotFoundException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (InstantiationException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (IllegalAccessException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (IllegalArgumentException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (InvocationTargetException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, e.getMessage());
		} catch (NoClassDefFoundError e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, "There is no such class - " + type);
		}
		return result;
	}
}
