package com.study.tune.entity;

public class Tune {
	protected double duration;
	protected TuneGenre genre;
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public TuneGenre getGenre() {
		return genre;
	}
	public void setGenre(TuneGenre genre) {
		this.genre = genre;
	}
}