package geoms;
import geoms.GeometricObject;

public class Circle extends GeometricObject {
	private float radius;

	public Circle(String color, boolean filled, float radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	public float getRadius() {
		return this.radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getArea() {
		return (float) (Math.ceil((Math.pow(this.radius, 2)* Math.PI*100.0))/100.0);
	}
	public float getPerimeter() {
		return (float) (Math.ceil(2 * Math.PI * this.radius*100.0)/100.0);
	}
	public float getDiameter() {
		return this.radius * 2;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getArea()=" + getArea()
				+ ", getPerimeter()=" + getPerimeter() + ", getDiameter()=" + getDiameter() + ", getColor()="
				+ getColor() + ", isFilled()=" + isFilled() + "]";
	}
	
	public static void main(String[] args) {
		Circle c1 =  new Circle("green", true, (float) 12.5);
		System.out.println(c1.toString());
	}
}
