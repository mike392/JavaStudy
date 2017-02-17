package com.study.abiturient.abiturientlist.utils;

import java.util.Comparator;
import java.util.List;

public class ListSorter<T> {
	private Comparator comparator;
	
	public ListSorter(Comparator comparator){
		this.comparator = comparator;
	}
	
	public List<T> getSortedListOfObjects(List<T> inputList){
		inputList.sort(comparator);
		return inputList;
		
	}
}
