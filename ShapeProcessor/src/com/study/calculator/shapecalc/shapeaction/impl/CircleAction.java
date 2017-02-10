package com.study.calculator.shapecalc.shapeaction.impl;

import com.study.calculator.shapecalc.shape.impl.Circle;
import com.study.calculator.shapecalc.shapeaction.ShapeAction;

public class CircleAction implements ShapeAction{
	private Circle circle;
	
	public CircleAction(Circle circle){
		this.circle = circle;
	}
	@Override
	public double computeSquare() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(circle.getRadius(), 2);
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * circle.getRadius();
	}

}
