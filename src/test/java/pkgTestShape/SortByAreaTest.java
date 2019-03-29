package pkgTestShape;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.SortByArea;

public class SortByAreaTest {

	@Test
	void testCompare() {
		SortByArea sortA = new SortByArea();
		Cuboid cub1 = new Cuboid(1, 1, 1);
		Cuboid cub2 = new Cuboid(2, 2, 2);
		assertEquals(-18, sortA.compare(cub1, cub2));
	}

}
