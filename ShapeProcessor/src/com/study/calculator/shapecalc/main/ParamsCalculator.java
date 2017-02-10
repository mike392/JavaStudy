package com.study.calculator.shapecalc.main;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.study.calculator.shapecalc.utils.Constants;

public class ParamsCalculator {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader(Constants.inputPath);
		System.out.print(reader != null);
	}
	
}
