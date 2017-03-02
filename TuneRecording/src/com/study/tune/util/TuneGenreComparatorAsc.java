package com.study.tune.util;

import java.util.Comparator;

import com.study.tune.entity.Tune;

public class TuneGenreComparatorAsc implements Comparator<Tune>{

	@Override
	public int compare(Tune arg0, Tune arg1) {
		return arg0.getGenre().compareTo(arg1.getGenre());
	}
}
