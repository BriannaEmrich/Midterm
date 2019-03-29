package pkgTestShape;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {

	@Test
	void testArea() {
		Cuboid cub = new Cuboid(1, 1, 1);
		assertEquals(6.0, cub.area());
	}

	@Test(expected = IllegalArgumentException.class)
	void testPerimeter() {
		Cuboid cub = new Cuboid(1, 1, 1);
		cub.perimeter();
	}

	@Test
	void testCuboid() {
		Cuboid cub = new Cuboid(1, 1, 1);
		assertEquals(1, cub.getiWidth());
		assertEquals(1, cub.getiLength());
		assertEquals(1, cub.getiDepth());
	}

	@Test
	void testGetiDepth() {
		Cuboid cub = new Cuboid(1, 1, 1);
		assertEquals(1, cub.getiDepth());
	}

	@Test
	void testSetiDepth() {
		Cuboid cub = new Cuboid(1, 1, 1);
		cub.setiDepth(2);
		assertEquals(2, cub.getiDepth());
	}

	@Test
	void testVolume() {
		Cuboid cub = new Cuboid(1, 1, 1);
		assertEquals(1, cub.volume());
	}

	@Test
	void testCompareToCuboid() {
		Cuboid cub1 = new Cuboid(1, 1, 1);
		Cuboid cub2 = new Cuboid(2, 2, 2);
		assertEquals(-18, cub1.compareTo(cub2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	void testThrowing() {
		Cuboid cub = new Cuboid(1, 1, -1);
	}
}
