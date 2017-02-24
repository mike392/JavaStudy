package com.study.tune.action;

import java.util.List;

import org.apache.logging.log4j.Level;

import com.study.tune.creator.TuneCreator;
import com.study.tune.entity.Tune;
import com.study.tune.entity.TuneGenre;
import com.study.tune.main.TuneRecordingProcessor;
import com.study.tune.util.Constants;

public class TuneListPopulator {
	public static void populateTuneListGivenInput(List<String> input){
		for (String item : input){
			String[] tuneParam = item.split(Constants.COLUMN_DELIMITER);
			try {
			Tune tune = (Tune) TuneCreator.createTuneBasedOnType(tuneParam[0]);
			tune.setDuration(Double.parseDouble(tuneParam[1].toUpperCase()));
			tune.setGenre(TuneGenre.valueOf(tuneParam[2].toUpperCase()));
			TuneTypePopulator.populateTuneType(tune, tuneParam[3].toUpperCase());
			TuneList.addTune(tune);
			} catch (ClassCastException e) {
				TuneRecordingProcessor.logger.log(Level.ERROR, "Cannot cast Tune class type to - " + tuneParam[0]);
			}
		}
	}
}