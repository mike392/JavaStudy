package com.study.tune.entity;

public class ElectronicTune extends Tune {
	private TuneType tuneType;

	public static enum TuneType {
		FAST, SLOW, NONE
	}
	
	public TuneType getTuneType() {
		return tuneType;
	}

	@Override
	public void setDefaultTuneType() {
		this.tuneType = TuneType.NONE;
	}

	@Override
	public void setTuneType(String tuneType) {
		this.tuneType = TuneType.valueOf(tuneType);
	}
}
