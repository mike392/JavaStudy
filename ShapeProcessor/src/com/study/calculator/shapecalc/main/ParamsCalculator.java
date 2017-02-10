package study.calculator.shapeparams;
import java.lang.reflect.Array;

import study.calculator.shapeparams.shapes.Circle;
import study.calculator.shapeparams.shapes.Shape;

public class ParamsCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (Array.getLength(args) > 0){
			for (String s : args) {
				Shape circle = new Circle(Double.parseDouble(s));
				double resultSquare = circle.getSquare();
				double resultPerimeter = circle.getPerimeter();
				System.out.println("The result square of circle with radius " + s + " is equal to " + String.valueOf(resultSquare) + " and parimeter is equal to " + String.valueOf(resultPerimeter));
			}
		} else {
			System.out.println("Please, enter the shape parameter");
		}
	}
	
}
