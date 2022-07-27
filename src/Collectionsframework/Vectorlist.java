package Collectionsframework;

import java.util.Vector;

public class Vectorlist {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("one");
		v.add("two");
		v.add("three");
		Integer i = new Integer(4);
		v.add(i);
		Integer value = (Integer)v.get(3);
		System.out.println(value);
	}
}
