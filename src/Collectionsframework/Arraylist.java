package Collectionsframework;

import java.util.ArrayList;


public class Arraylist {
public static void main(String[] args) {
	ArrayList AL = new ArrayList();
	AL.add("one");
	AL.add("two");
	AL.add("three");
	
	Integer i = new Integer(4);
	AL.add(i);
	Integer value = (Integer) AL.get(3);
	System.out.println(value);
}
}
