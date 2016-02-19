import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	/**
	@Test
	public void testAdd() {
		MyCalculator calcu = new MyCalculator();

		assertEquals("10 + 3 = 13", 13.0, calcu.add(10, 3), 0.0);
	}
	*/

	/**
	@Test
	public void testSubtract() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("8 - 5 = 3", 3.0, calcu.subtract(8, 5), 0.0);
	}
	*/

	/**
	@Test
	public void testMultiply() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("10 x 4 = 40", 40.0, calcu.multiply(10, 4), 0.0);
	}
	*/

	/**
	@Test
	public void testDivide() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("16 / 4 = 4", 4.0, calcu.divide(16, 4), 0.0);
	}
	*/

	/*
	@Test
	public void testSquare() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("4 x 4 = 16", 16.0, calcu.square(4), 0.0);
	}

	@Test
	public void testCube() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("2 x 2 x 2 = 8", 8.0, calcu.cube(2), 0.0);
	}
	*/

	@Test
	public void testNfactorial() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("6! = 720", 720.0, calcu.nfactorial(6), 0.0);
	}

	@Test
	public void testZerofactorial() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("0! = 1", 1.0, calcu.nfactorial(0), 0.0);
	}
	
	@Test
	public void testOnefactorial() {
		MyCalculator calcu = new MyCalculator();
		
		assertEquals("0! = 1", 1.0, calcu.nfactorial(0), 0.0);
	}
	
	
	@Test
	public void testBinarySearch() {
		MyCalculator calcu = new MyCalculator();
		
		int[] a = {10, 12, 14, 16, 18, 20};
		int x = 12;
		
		assertEquals("expecting 1", 1.0, calcu.binarySearch(a, x), 0.0);
		
	}
	
	@Test
	public void testEmptyBinarySearch() {
		MyCalculator calcu = new MyCalculator();
		
		int[] a = {};
		int x = 20;
		
		assertEquals("expecting -1", -1.0, calcu.binarySearch(a, x), 0.0);
		
	}
	
	@Test
	public void testMissingBinarySearch() {
		MyCalculator calcu = new MyCalculator();
		
		int[] a = {10, 12, 14, 16, 18, 20};
		int x = 49;
		
		assertEquals("expecting -1", -1.0, calcu.binarySearch(a, x), 0.0);
		
	}
	
	@Test
	public void testLeftBinarySearch() {
		MyCalculator calcu = new MyCalculator();
		
		int[] a = {10, 12, 14, 16, 18, 20};
		int x = 10;
		
		assertEquals("expecting 0", 0.0, calcu.binarySearch(a, x), 0.0);
		
	}
	
	@Test
	public void testRightBinarySearch() {
		MyCalculator calcu = new MyCalculator();
		
		int[] a = {10, 12, 14, 16, 18, 20};
		int x = 20;
		
		assertEquals("expecting 0", 5.0, calcu.binarySearch(a, x), 0.0);
		
	}

}
