package com.study.tune.entity;

public class VocalTune extends Tune {
	private VocalType vocalType;

	public enum VocalType {
		MALE, FEMALE, NONE
	}
	
	public VocalType getVocalType() {
		return vocalType;
	}

	public void setVocalType(VocalType vocalType) {
		this.vocalType = vocalType;
	}
}
