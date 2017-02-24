package com.study.tune.action;

import java.util.List;
import java.util.stream.Collectors;

import com.study.tune.entity.Tune;

public class TuneWithinDurationRangeFinder {
	public static List<Tune> findTuneListWithinGivenRange(List<Tune> input, double upperBound, double lowerBound){
		return input.stream().filter(tune -> tune.getDuration() > lowerBound && tune.getDuration() <= upperBound).collect(Collectors.toList());
	}
}
