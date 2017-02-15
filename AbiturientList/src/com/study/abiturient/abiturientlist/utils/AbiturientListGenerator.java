package com.study.abiturient.abiturientlist.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.study.abiturient.abiturientlist.abiturient.Abiturient;

public class AbiturientListGenerator {
	
	public static List<Abiturient> generateAbiturientList(HashMap<String, String> listWithMarks){
		List<Abiturient> result = new LinkedList<Abiturient>();
		if (listWithMarks.size() > 0){
			for (Entry<String, String> entry : listWithMarks.entrySet()){
				
				if (MarksListValidator.isAlphaString(entry.getKey()) && MarksListValidator.isPositiveInt(entry.getValue())){
					Abiturient abiturient = new Abiturient();
					abiturient.setName((String) entry.getKey());
					abiturient.setMark(Integer.parseInt((String) entry.getValue()));
					result.add(abiturient);
				}
			}
		}
		return result;
	}
}
