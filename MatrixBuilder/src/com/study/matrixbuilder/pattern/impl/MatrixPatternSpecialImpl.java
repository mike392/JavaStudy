package com.study.matrixbuilder.pattern.impl;

import com.study.matrixbuilder.pattern.MatrixPattern;
import com.study.matrixbuilder.utils.Constants;

public class MatrixPatternSpecialImpl implements MatrixPattern{

	@Override
	public int generateValue(int verticalParameter, int horizontalParameter) {
		int result = 0;
		if (verticalParameter % 2 > 0){
			result = horizontalParameter + 1;
		} else {
			result = Constants.MATRIX_PARAMETER - horizontalParameter;
		}
		return result;
	}

}
