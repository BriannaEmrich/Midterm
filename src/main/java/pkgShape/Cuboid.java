package pkgShape;

public class Cuboid extends Rectangle {
	private int iDepth;
	private SortByArea areaSort;
	private SortByVolume volSort;
	
	
	public Cuboid (int width, int length, int depth) {
		super(width, length);
		if (depth>0) {
			iDepth = depth;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depth) {
		if (depth>0) {
			iDepth = depth;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public double volume() {
		double volume = super.getiWidth()*super.getiLength()*iDepth;
		return volume;
	}
	
	public double area() {
		double area = (2*super.getiWidth()*super.getiLength())+(2*super.getiWidth()*iDepth)+(2*super.getiLength()*iDepth);
		return area;
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Cuboid cub) {
		return (int)(this.area()-cub.area());
	}

}
