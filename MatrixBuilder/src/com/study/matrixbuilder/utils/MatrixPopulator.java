package com.study.matrixbuilder.utils;

import com.study.matrixbuilder.matrix.Matrix;
import com.study.matrixbuilder.pattern.MatrixPattern;

public class MatrixPopulator {
	
	public static Matrix getPopulatedMatrix(MatrixPattern pattern, Matrix matrix){
		for (int i = 0; i < matrix.getVerticalLength(); i++){
			for (int j = 0; j < matrix.getHorizontalLength(); j++){
				matrix.setElement(i, j, pattern.generateValue(i, j));
			}
		}
		return matrix;
	}
}
