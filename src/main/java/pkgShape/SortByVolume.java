package pkgShape;
import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid>{
	public int compare(Cuboid o1, Cuboid o2) {
		return (int)(o1.volume()-o2.volume());
	}

}
