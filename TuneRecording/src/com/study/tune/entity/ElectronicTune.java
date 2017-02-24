package com.study.tune.entity;

public class ElectronicTune extends Tune {
	private TuneType tuneType;

	public enum TuneType {
		FAST, SLOW, NONE
	}
	
	public TuneType getTuneType() {
		return tuneType;
	}

	public void setTuneType(TuneType tuneType) {
		this.tuneType = tuneType;
	}
	
/*	public String toString(){
		return this.tuneType + super.;
		
	}*/
}
