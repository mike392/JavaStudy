package com.study.abiturient.abiturientlist.main;

import java.util.HashMap;
import java.util.List;


import com.study.abiturient.abiturientlist.abiturient.Abiturient;
import com.study.abiturient.abiturientlist.utils.AbiturientListGenerator;
import com.study.abiturient.abiturientlist.utils.Constants;
import com.study.abiturient.abiturientlist.utils.CustomAbiturientComparator;
import com.study.abiturient.abiturientlist.utils.InputDataMapGenerator;
import com.study.abiturient.abiturientlist.utils.ListSorter;
import com.study.abiturient.abiturientlist.utils.ReportPrinter;

public class AbiturientListProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> list = InputDataMapGenerator.generateListWithMarks();
		List<Abiturient> abiturientList = AbiturientListGenerator.generateAbiturientList(list);
		CustomAbiturientComparator comparator = new CustomAbiturientComparator();
		ListSorter<Abiturient> sorter = new ListSorter<Abiturient>(comparator); 
		abiturientList = sorter.getSortedListOfObjects(abiturientList);
		ReportPrinter.printReport(abiturientList.subList(0, Constants.AMOUNT_OF_AVAILABLE_PLACES));
		System.out.println("1");
	}

}
