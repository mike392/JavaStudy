package com.java.study.matrixbuilder.utils;

import com.java.study.matrixbuilder.matrix.Matrix;
import com.java.study.matrixbuilder.pattern.MatrixPattern;

public class MatrixPopulator {
	private Matrix matrix;
	private final MatrixPattern pattern;
	
	public MatrixPopulator(Matrix matrix,
							final MatrixPattern pattern){
		this.matrix = matrix;
		this.pattern = pattern;
	}
	
	public Matrix getPopulatedMatrix(){
		for (int i = 0; i < matrix.getVerticalLength(); i++){
			for (int j = 0; j < matrix.getHorizontalLength(); j++){
				matrix.setElement(i, j, pattern.generateValue(i, j));
			}
		}
		return matrix;
	}
}
