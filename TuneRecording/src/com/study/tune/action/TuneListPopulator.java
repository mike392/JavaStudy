package com.study.tune.action;

import java.util.List;

import com.study.tune.creator.TuneCreator;
import com.study.tune.entity.Tune;
import com.study.tune.entity.TuneGenre;
import com.study.tune.util.Constants;

public class TuneListPopulator {
	public static void populateTuneListGivenInput(List<String> input){
		for (String item : input){
			String[] tuneParam = item.split(Constants.COLUMN_DELIMITER);
			Tune tune = (Tune) TuneCreator.createTuneBasedOnType(tuneParam[0]);
			tune.setDuration(Double.parseDouble(tuneParam[1].toUpperCase()));
			tune.setGenre(TuneGenre.valueOf(tuneParam[2].toUpperCase()));
			TuneTypePopulator.populateTuneType(tune, tuneParam[3].toUpperCase());
			TuneList.addTune(tune);
			System.out.println("1");
		}
	}
}
