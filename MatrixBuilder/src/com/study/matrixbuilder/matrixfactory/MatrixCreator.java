package com.study.matrixbuilder.matrixfactory;

import com.study.matrixbuilder.matrix.Matrix;

public class MatrixCreator {
	
	public static Matrix createEmptySquareMatrix(int matrixParameter){
		Matrix matrix = new Matrix(matrixParameter, matrixParameter);
		return matrix;
	}
	
	public static Matrix createEmptyMatrix(int verticalParameter, int horizontalParameter){
		Matrix matrix = new Matrix(verticalParameter, horizontalParameter);
		return matrix;
	}
	
}
