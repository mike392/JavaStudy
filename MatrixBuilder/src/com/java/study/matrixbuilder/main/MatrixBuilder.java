package com.java.study.matrixbuilder.main;

import com.java.study.matrixbuilder.matrix.Matrix;
import com.java.study.matrixbuilder.matrixfactory.MatrixCreator;
import com.java.study.matrixbuilder.pattern.MatrixPattern;
import com.java.study.matrixbuilder.pattern.impl.MatrixPatternImpl;
import com.java.study.matrixbuilder.pattern.impl.MatrixPatternSpecialImpl;
import com.java.study.matrixbuilder.utils.Constants;
import com.java.study.matrixbuilder.utils.MatrixPopulator;
import com.java.study.matrixbuilder.utils.ReportPrinter;

public class MatrixBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixCreator creator = new MatrixCreator();
		Matrix matrix = creator.createEmptySquareMatrix(Constants.MATRIX_PARAMETER);
		MatrixPattern pattern = new MatrixPatternImpl();
		MatrixPopulator populator = new MatrixPopulator(matrix, pattern);
		ReportPrinter printer = new ReportPrinter(populator.getPopulatedMatrix());
		printer.printReport();
		pattern = new MatrixPatternSpecialImpl();
		populator = new MatrixPopulator(matrix, pattern);
		printer = new ReportPrinter(populator.getPopulatedMatrix());
		printer.printReport();
	}

}