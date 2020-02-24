package excersiceoop;

public class ClassCircle {
	private double radius;
	private String color;
	
	public ClassCircle() {
		radius = 1.00;
		color = "red";
	}
	
	public ClassCircle(double r) {
		radius=r;
		color = "red";
	}
	
	public ClassCircle(double r, String c) {
		this.radius=r;
		this.color= c;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newcolor) {
		this.color = newcolor;
	}


		
	}

	
