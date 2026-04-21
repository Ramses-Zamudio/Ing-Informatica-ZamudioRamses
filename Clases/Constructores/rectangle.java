
public class rectangle {
	double high, width;
	
	public rectangle() {
		high = width = 1;
	}
	
	public rectangle(double h, double w) {
		high = h;
		width = w;
	}
	
	public double getArea() {
		return (high * width);
	}
	
	public double getPerimeter() {
		return ((2*high) + (2*width));
	}
}
