package study.calculator.shapeparams.shapes;

public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	public double getSquare() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

}
