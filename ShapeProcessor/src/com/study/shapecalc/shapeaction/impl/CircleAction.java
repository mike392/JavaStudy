package com.study.shapecalc.shapeaction.impl;

import com.study.shapecalc.shape.Shape;
import com.study.shapecalc.shape.impl.Circle;
import com.study.shapecalc.shapeaction.ShapeAction;

public class CircleAction implements ShapeAction{
	private Circle circle;
	
	public CircleAction(Shape circle){
		this.circle = (Circle) circle;
	}
	@Override
	public double computeSquare() {
		return Math.PI * Math.pow(circle.getRadius(), 2);
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * circle.getRadius();
	}

}
