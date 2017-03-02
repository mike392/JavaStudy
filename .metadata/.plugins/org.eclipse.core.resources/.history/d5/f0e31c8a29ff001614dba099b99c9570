package com.study.tune.entity;

import org.apache.commons.lang3.EnumUtils;
import org.apache.logging.log4j.Level;

import com.study.tune.main.TuneRecordingProcessor;

public enum TuneEnum {
	ELECTRONIC(new ElectronicTune()) {
		@Override
		public boolean isValidTuneType(String type) {
			return EnumUtils.isValidEnum(ElectronicTune.TuneType.class, type);
		}
	},
	INSTRUMENTAL(new InstrumentalTune()) {
		@Override
		public boolean isValidTuneType(String type) {
			boolean result = false;
			if (isPositiveInt(type)){
				result = true;
			}
			return result;
		}
	},
	VOCAL(new VocalTune()) {
		@Override
		public boolean isValidTuneType(String type) {
			return EnumUtils.isValidEnum(VocalTune.VocalType.class, type);
		}
	}; 
	
	private Tune tune;
	
	private TuneEnum(Tune tune){
		this.setTune(tune);
	}
	public abstract boolean isValidTuneType(String type);
	
	public Tune getTune() {
		return tune;
	}

	public void setTune(Tune tune) {
		this.tune = tune;
	}
	
	private static boolean isPositiveInt(String type) {
		boolean result = false;
		try {
			Integer.parseInt(type);
			result = true;
		} catch (NumberFormatException e) {
			TuneRecordingProcessor.logger.log(Level.ERROR, "Cannot convert Instrument tune type to int - " + type);
		}
		return result;
	}
}
