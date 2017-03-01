package com.study.tune.util;

public class WrongTuneTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongTuneTypeException(){
	}
	
	public WrongTuneTypeException(String message, Throwable e){
		super(message, e);
	}
	
	public WrongTuneTypeException(String message){
		super(message);
	}
	
	public WrongTuneTypeException(Throwable e){
		super(e);
	}

}
