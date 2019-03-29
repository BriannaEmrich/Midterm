package pkgTestShape;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.SortByVolume;

public class SortByVolumeTest {

	@Test
	void testCompare() {
		Cuboid cub1 = new Cuboid(1, 1, 1);
		Cuboid cub2 = new Cuboid(2, 2, 2);
		SortByVolume sortV = new SortByVolume();
		assertEquals(-7, sortV.compare(cub1, cub2));
	}

}
