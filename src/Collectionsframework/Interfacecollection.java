package Collectionsframework;

import java.util.ArrayList;

public class Interfacecollection {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(2.5);
		list.add("Aadarsh");
		list.add(35);
		list.add(5);

		
		  System.out.println(list.containsAll(list));
		  
		  System.out.println(list.contains(15));
		  
		  System.out.println(list.isEmpty());
		 
	}

}
