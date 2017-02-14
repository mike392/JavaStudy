package com.java.study.matrixbuilder.matrixfactory;

import com.java.study.matrixbuilder.matrix.Matrix;

public class MatrixCreator {
	private Matrix matrix;
	
	public Matrix createEmptySquareMatrix(int matrixParameter){
		matrix = new Matrix(matrixParameter, matrixParameter);
		return matrix;
	}
	
	public Matrix createEmptyMatrix(int verticalParameter, int horizontalParameter){
		matrix = new Matrix(verticalParameter, horizontalParameter);
		return matrix;
	}
	
}