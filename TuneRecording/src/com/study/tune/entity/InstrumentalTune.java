package com.study.tune.entity;

public class InstrumentalTune extends Tune {
	private int instrumentAmount;

	public int getInstrumentAmount() {
		return instrumentAmount;
	}

	public void setInstrumentAmount(int instrumentAmount) {
		this.instrumentAmount = instrumentAmount;
	}

	@Override
	public void setDefaultTuneType() {
		this.instrumentAmount = 0;
	}

	@Override
	public Object getTuneType() {
		return instrumentAmount;
	}

	@Override
	public void setTuneType(String tuneType) {
		instrumentAmount = Integer.parseInt(tuneType);		
	}

}
