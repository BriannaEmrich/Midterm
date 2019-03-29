package pkgTestShape;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	void testArea() {
		Rectangle rect = new Rectangle(5, 7);
		assertEquals(35.0, rect.area());
	}

	@Test
	void testPerimeter() {
		Rectangle rect = new Rectangle(5, 7);
		assertEquals(24.0, rect.perimeter());
	}

	@Test
	void testRectangle() {
		Rectangle rect = new Rectangle(5, 7);
		assertEquals(5, rect.getiWidth());
		assertEquals(7, rect.getiLength());
	}

	@Test
	void testGetiWidth() {
		Rectangle rect = new Rectangle(5, 7);
		assertEquals(5, rect.getiWidth());
	}

	@Test
	void testSetiWidth() {
		Rectangle rect = new Rectangle(5, 7);
		rect.setiWidth(8);
		assertEquals(8, rect.getiWidth());
	}

	@Test
	void testGetiLength() {
		Rectangle rect = new Rectangle(5, 7);
		assertEquals(7, rect.getiLength());
	}

	@Test
	void testSetiLength() {
		Rectangle rect = new Rectangle(5, 7);
		rect.setiLength(9);
		assertEquals(9, rect.getiLength());
	}

	@Test
	void testCompareTo() {
		Rectangle rect1 = new Rectangle(5, 7);
		Rectangle rect2 = new Rectangle(8, 9);
		assertEquals(-37, rect1.compareTo(rect2));
	}
	
	@Test(expected = IllegalArgumentException.class)
	void testThrowing() {
		Rectangle rect = new Rectangle(-5, 7);
	}

}
