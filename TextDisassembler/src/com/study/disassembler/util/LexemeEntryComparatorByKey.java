package com.study.disassembler.util;

import java.util.Comparator;
import java.util.Map.Entry;

public class LexemeEntryComparatorByKey implements Comparator<Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getKey().compareTo(o2.getKey());
	}

}
