package com.study.abiturientlist.main;

import java.util.HashMap;
import java.util.List;


import com.study.abiturientlist.abiturient.Abiturient;
import com.study.abiturientlist.utils.AbiturientListGenerator;
import com.study.abiturientlist.utils.AbiturientMarkComparator;
import com.study.abiturientlist.utils.Constants;
import com.study.abiturientlist.utils.InputDataMapGenerator;
import com.study.abiturientlist.utils.ListSorter;
import com.study.abiturientlist.utils.ReportPrinter;

public class AbiturientListProcessor {

	public static void main(String[] args) {
		HashMap<String,String> list = InputDataMapGenerator.generateListWithMarks();
		List<Abiturient> abiturientList = AbiturientListGenerator.generateAbiturientList(list);
		AbiturientMarkComparator comparator = new AbiturientMarkComparator();
		ListSorter<Abiturient> sorter = new ListSorter<Abiturient>(comparator); 
		abiturientList = sorter.getSortedListOfObjects(abiturientList);
		ReportPrinter.printReport(abiturientList.subList(0, Constants.AMOUNT_OF_AVAILABLE_PLACES));
		System.out.println("1");
	}

}
