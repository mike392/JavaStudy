package com.study.calculator.shapecalc.shape.impl;

import com.study.calculator.shapecalc.shape.Shape;

public class Circle extends Shape{
	private double radius;
	
	public Circle(){
	}

	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	public double setRadius(double radius) {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

}
