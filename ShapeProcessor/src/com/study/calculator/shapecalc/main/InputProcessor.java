package com.study.calculator.shapecalc.main;

import java.util.LinkedList;
import java.util.List;

import com.study.calculator.shapecalc.shape.impl.Circle;
import com.study.calculator.shapecalc.shapeaction.ShapeAction;
import com.study.calculator.shapecalc.shapeaction.impl.CircleAction;
import com.study.calculator.shapecalc.utils.Constants;

public class InputProcessor {
	
	private List<Double> input;
	
	public InputProcessor(List<Double> list){
		this.input = list;
	}
	
	public List<String> generateOutput(){
		List<String> output = new LinkedList<String>();
		if (input.size() == 0){
			output.add(Constants.WRONG_INPUT_MESSAGE);
		} else {
			for (Double item : input){
				Circle circle = new Circle(item.doubleValue());
				ShapeAction action = new CircleAction(circle);
				output.add("Shape with radius " + circle.getRadius() + " square equals " + action.computeSquare() + " and perimeter equals " + action.computePerimeter() + "\n");
			}
		}
		return output;
	}

}
