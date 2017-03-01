package com.study.tune.entity;

public class VocalTune extends Tune {
	private VocalType vocalType;

	public enum VocalType {
		MALE, FEMALE, NONE
	}
	
	@Override
	public VocalType getTuneType() {
		return vocalType;
	}

	@Override
	public void setDefaultTuneType() {
		this.vocalType = VocalType.NONE;
	}

	@Override
	public void setTuneType(String tuneType) {
		this.vocalType = VocalType.valueOf(tuneType);
	}

}
