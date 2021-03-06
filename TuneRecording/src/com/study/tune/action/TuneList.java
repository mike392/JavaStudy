package com.study.tune.action;

import java.util.LinkedList;
import java.util.List;

import com.study.tune.entity.Tune;

public class TuneList {
	private static List<Tune> tuneList = new LinkedList<Tune>();
	
	public static <T extends Tune> void addTune(T item){
		tuneList.add(item);
	}
	
	public static <T extends Tune> void removeTune(T item){
		tuneList.remove(item);
	}
	
	public static List<Tune> getTuneList() {
		return tuneList;
	}

	public static void setTuneList(List<Tune> list) {
		TuneList.tuneList = list;
	}
	
	
}
