package com.study.tune.creator;

import com.study.tune.entity.Tune;
import com.study.tune.entity.TuneEnum;
import com.study.tune.util.WrongTuneTypeException;

public class TuneCreator {
	public static Tune createTune(String tuneType) throws WrongTuneTypeException{
		Object tune = new Object();
		try {
			TuneEnum abstractTune = TuneEnum.valueOf(tuneType);
			tune = abstractTune.getTune().getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException e){
			throw new WrongTuneTypeException(e);
		}
		return (Tune) tune;
	}
}
