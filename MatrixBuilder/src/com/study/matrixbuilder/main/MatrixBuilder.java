package com.study.matrixbuilder.main;

import com.study.matrixbuilder.matrix.Matrix;
import com.study.matrixbuilder.matrixfactory.MatrixCreator;
import com.study.matrixbuilder.pattern.MatrixPattern;
import com.study.matrixbuilder.pattern.impl.MatrixPatternImpl;
import com.study.matrixbuilder.pattern.impl.MatrixPatternSpecialImpl;
import com.study.matrixbuilder.utils.Constants;
import com.study.matrixbuilder.utils.MatrixPopulator;
import com.study.matrixbuilder.utils.ReportPrinter;

public class MatrixBuilder {

	public static void main(String[] args) {
		Matrix matrix = MatrixCreator.createEmptySquareMatrix(Constants.MATRIX_PARAMETER);
		MatrixPattern pattern = new MatrixPatternImpl();
		matrix = MatrixPopulator.getPopulatedMatrix(pattern, matrix);
		ReportPrinter.printReport(matrix);
		pattern = new MatrixPatternSpecialImpl();
		matrix = MatrixPopulator.getPopulatedMatrix(pattern, matrix);
		ReportPrinter.printReport(matrix);
	}

}
