package com.study.tune.entity;

public abstract class Tune {
	protected double duration;
	protected TuneGenreEnum genre;
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public TuneGenreEnum getGenre() {
		return genre;
	}
	public void setGenre(TuneGenreEnum genre) {
		this.genre = genre;
	}
	public abstract Object getTuneType();
	public abstract void setTuneType(String tuneType);
	public abstract void setDefaultTuneType();


}
