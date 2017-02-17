package com.study.shapecalc.main;

import java.util.LinkedList;
import java.util.List;

import com.study.shapecalc.shape.impl.Circle;
import com.study.shapecalc.shapeaction.ShapeAction;
import com.study.shapecalc.shapeaction.impl.CircleAction;
import com.study.shapecalc.utils.Constants;

public class InputProcessor {
	
	public static List<String> generateOutput(List<Double> input){
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
