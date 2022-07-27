package Collectionsframework;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1", "java");
		map.put("2", "C++");
		map.put("3", "Phython");
		map.put("4", "Php");
		map.put("5", ".Net");
		
		//map.clear();
		System.out.println(map.containsKey("5"));
		System.out.println(map.containsValue("java"));
		System.out.println(map.entrySet());
	}

}
