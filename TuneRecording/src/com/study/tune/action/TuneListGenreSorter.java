package com.study.tune.action;

import java.util.List;

import com.study.tune.entity.Tune;
import com.study.tune.util.TuneGenreComparatorAsc;

public class TuneListGenreSorter {
	public static List<Tune> sortListAsc(List<Tune> input){
		input.sort(new TuneGenreComparatorAsc());
		return input;
	}
}
