package com.study.abiturient.abiturientlist.utils;

import java.util.Comparator;

import com.study.abiturient.abiturientlist.abiturient.Abiturient;

public class CustomAbiturientComparator implements Comparator<Abiturient>{

	@Override
	public int compare(Abiturient arg0, Abiturient arg1) {
		// TODO Auto-generated method stub
		return arg1.getMark().compareTo(arg0.getMark());
	}

}
