package com.study.shapecalc.shape.impl;

import com.study.shapecalc.shape.Shape;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
