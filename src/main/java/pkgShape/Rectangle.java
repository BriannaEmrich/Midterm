package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle>{

	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int width, int length) {
		if (width>0 && length>0) {
			iWidth = width;
			iLength = length;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int width) {
		if (width>0) {
			iWidth = width;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		if (length>0) {
			iLength = length;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public double area() {
		double area = iWidth*iLength;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = (2*iWidth)+(2*iLength);
		return perimeter;
	}
	
	public int compareTo(Rectangle rect) {
		return (int) (this.area() - rect.area());
	}

}
