package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Main.Rectangle;

import java.math.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class RectangleTest{
	
	@Test
	public final void testHashSetRectangle(){
		Rectangle r1 = new Rectangle(91,45.5);
		Rectangle r2 = new Rectangle(20,10);
		Rectangle r3 = new Rectangle(6,5);
		Rectangle r4 = new Rectangle(50.5,50.5);
		Rectangle r5 = new Rectangle(200,100);
		HashSet hs = new HashSet();
		hs.add(r1);
		hs.add(r2);
		hs.add(r3);
		hs.add(r4);
		hs.add(r5);
		
		assertEquals(5, hs.size());
		hs.remove(r5);
		assertEquals(4, hs.size());
	}
	
	@Test
	public final void testHashMap(){
		Rectangle r1 = new Rectangle(91,45.5);
		Rectangle r2 = new Rectangle(20,10);
		Rectangle r3 = new Rectangle(6,5);
		Rectangle r4 = new Rectangle(50.5,50.5);
		Rectangle r5 = new Rectangle(200,100);
		
		HashMap<Rectangle, Double> hm = new HashMap<>();
		assertTrue(hm.isEmpty());
		hm.put(r1, r1.getArea());
		hm.put(r2, r2.getArea());
		hm.put(r3, r3.getArea());
		hm.put(r4, r4.getArea());
		hm.put(r5, r5.getArea());
		hm.put(r5, r2.getArea()); // Duplicate key
		
		System.out.println(hm);
		assertEquals(5, hm.size());
		hm.remove(r4);
		assertEquals(4, hm.size());
	}
	
	@Test
	public final void testTreeSet(){
		Rectangle r1 = new Rectangle(91,45.5);
		Rectangle r2 = new Rectangle(20,10);
		Rectangle r3 = new Rectangle(6,5);
		Rectangle r4 = new Rectangle(50.5,50.5);
		Rectangle r5 = new Rectangle(200,100);
		
		TreeSet ts = new TreeSet();
		ts.add(r1.getArea());
		ts.add(r2.getArea());
		ts.add(r3.getArea());
		ts.add(r4.getArea());
		ts.add(r5.getArea());
		
		// Sorted by Area in ascending order.
		System.out.println(ts);
		assertEquals(5,ts.size());
		ts.remove(r5.getArea());
		assertEquals(4,ts.size());
	}
	
	@Test
	public final void testTreeMap(){
		Rectangle r1 = new Rectangle(91,45.5);
		Rectangle r2 = new Rectangle(20,10);
		Rectangle r3 = new Rectangle(6,5);
		Rectangle r4 = new Rectangle(50.5,50.5);
		Rectangle r5 = new Rectangle(200,100);
		
		TreeMap<Double, String> tm = new TreeMap<>();
		assertTrue(tm.isEmpty());
		tm.put(r1.getArea(), "r1");
		tm.put(r2.getArea(), "r2");
		tm.put(r3.getArea(), "r3");
		tm.put(r4.getArea(), "r4");
		tm.put(r5.getArea(), "r5");
		
		// Naturally sorted by key as the Area
		System.out.println(tm);
		
		assertEquals(5, tm.size());
		tm.remove(r3.getArea());
		assertEquals(4, tm.size());
		
	}
	
	@Test
	public final void testLinkedList(){
		Rectangle r1 = new Rectangle(91,45.5);
		Rectangle r2 = new Rectangle(20,10);
		Rectangle r3 = new Rectangle(6,5);
		Rectangle r4 = new Rectangle(50.5,50.5);
		Rectangle r5 = new Rectangle(200,100);
		
		LinkedList<Rectangle> iList = new LinkedList();
		iList.add(r4);
		iList.add(r5);
		System.out.println(iList);
		assertEquals(2, iList.size());
		iList.removeFirst();
		assertEquals(1,iList.size());
	}
	
	@Test
	public final void testArrayList(){
		Rectangle r1 = new Rectangle(91,45.5);
		Rectangle r2 = new Rectangle(20,10);
		Rectangle r3 = new Rectangle(6,5);
		Rectangle r4 = new Rectangle(50.5,50.5);
		Rectangle r5 = new Rectangle(200,100);
		
		ArrayList<Rectangle> aList = new ArrayList();
		
		aList.add(r4);
		aList.add(r3);
		aList.add(r2);
		aList.add(r1);
		aList.add(r5);
		aList.add(r4); // Duplicate entry
		
		System.out.println(aList );
		assertFalse(5 == aList.size());
		assertEquals(6, aList.size());
		aList.remove(2);
		assertFalse(aList.contains(r2));
		assertEquals(5, aList.size());
	}
}
