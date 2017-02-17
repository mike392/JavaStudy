package com.study.matrixbuilder.pattern.impl;

import java.util.Arrays;
import java.util.List;

import com.study.matrixbuilder.pattern.MatrixPattern;
import com.study.matrixbuilder.utils.Constants;

public class MatrixPatternImpl implements MatrixPattern{

	@Override
	public int generateValue(int verticalParameter, int horizontalParameter) {
		// TODO Auto-generated method stub
		int result = 0;
		List<String> conditionList = Arrays.asList(String.valueOf(0), String.valueOf((Constants.MATRIX_PARAMETER - 1)));
		if (conditionList.contains(String.valueOf(verticalParameter)) || conditionList.contains(String.valueOf(horizontalParameter))){
			result = 1;
		}  
		return result;
	}

}
