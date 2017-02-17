package com.java.study.matrixbuilder.matrix;

public class Matrix {
	private int[][] matrix;
	
	public Matrix(int horizontalParameter, int verticalParameter){
		matrix = new int[verticalParameter][horizontalParameter];
	}
	
	public int getVerticalLength(){
		return matrix.length;
	}
	
	public int getHorizontalLength(){
		return matrix[0].length;
	}
	
	public void setElement(int verticalParameter, int horizontalParameter, int value){
		matrix[verticalParameter][horizontalParameter] = value;
	}
	
	public int getElement(int verticalParameter, int horizontalParameter){
		return matrix[verticalParameter][horizontalParameter];
	}
	
	public String toString(){
		String result = "";
		for (int[] vector : matrix){
			for (int value : vector){
				result += String.valueOf(value) + " ";
			}
			result += "\n";
		}
		return result;
	}
}
