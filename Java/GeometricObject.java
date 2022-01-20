package geoms;

public class GeometricObject {
	
	private String color;
	private boolean filled;
	

	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return this.filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + "]";
	}
	
}
