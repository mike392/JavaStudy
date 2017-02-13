package com.java.study.matrixbuilder.utils;

import com.java.study.matrixbuilder.matrix.Matrix;

public class ReportPrinter {
	private Matrix matrix;
	
	public ReportPrinter(Matrix matrix){
		this.matrix = matrix;
	}
	
	public void printReport(){
		System.out.print(matrix.toString());
	}
}
