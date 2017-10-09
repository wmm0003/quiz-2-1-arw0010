package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class ShapeTest {

	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases.
	 * Test each class's constructor method and calculateArea method.
	 */
	@Test
	public void testCompareTo() {
		assertEquals(0,new Square(3).compareTo(new Square(3)),0);
		assertEquals(0,new Circle(3).compareTo(new Circle(3)),0);
		assertEquals(1,new Square(5).compareTo(new Square(3)),0);
		assertEquals(-1,new Square(2).compareTo(new Square(3)),0);
	}

}
