package excersiceoop;

public class Square extends Rectangle {

	public Square() {
		super();
	}
	
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return width*2 +length*2;
	}
	
	public void setLength(double length) {
		super.length = length;
	}
	
	public void setWidth(double width) {
		super.width= width;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", getArea()=" + getArea() + "]";
	}
	
}
