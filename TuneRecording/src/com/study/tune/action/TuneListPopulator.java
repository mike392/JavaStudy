package com.study.tune.action;

import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.study.tune.creator.TuneCreator;
import com.study.tune.entity.Tune;
import com.study.tune.entity.TuneEnum;
import com.study.tune.entity.TuneGenreEnum;
import com.study.tune.main.TuneRecordingProcessor;
import com.study.tune.util.Constants;
import com.study.tune.util.WrongTuneTypeException;

public class TuneListPopulator {
	static Logger logger = LogManager.getLogger(TuneListPopulator.class);
	public static void populateTuneListGivenInput(List<String> input){
		for (String item : input){
			String[] tuneParam = item.split(Constants.COLUMN_DELIMITER);
			try {
				Tune tune = TuneCreator.createTune(tuneParam[0].toUpperCase());
				tune.setDuration(Double.parseDouble(tuneParam[1].toUpperCase()));
				tune.setGenre(TuneGenreEnum.valueOf(tuneParam[2].toUpperCase()));
				if (TuneEnum.valueOf(tuneParam[0].toUpperCase()).isValidTuneType(tuneParam[3].toUpperCase())){
					tune.setTuneType(tuneParam[3].toUpperCase());
				} else {
					tune.setDefaultTuneType();
				}
				TuneList.addTune(tune);
			} catch (WrongTuneTypeException e) {
				logger.log(Level.ERROR, "Wrong tune type supplied - " + tuneParam[0]);
			}
		}
	}
}
