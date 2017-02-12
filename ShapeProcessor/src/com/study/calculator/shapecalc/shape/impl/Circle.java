package com.study.calculator.shapecalc.shape.impl;

import com.study.calculator.shapecalc.shape.Shape;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	public void setRadius(double radius) {
		// TODO Auto-generated method stub
		this.radius = radius;
	}

}
