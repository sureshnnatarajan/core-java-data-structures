package com.suresh.learnings.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionGeneratorUtil {
	
	private CollectionGeneratorUtil() { }

	public static List<String> listOfStrings() {
	
		List<String> stringList = new ArrayList<>(10);
		
		stringList.add("L1");
		stringList.add("L2");
		stringList.add("L3");
		stringList.add("L4");
		stringList.add("L5");
		
		return stringList;
	}
	
	public static Set<String> setOfStrings() {
		
		Set<String> stringSet = new HashSet<>(10);
		
		stringSet.add("S1");
		stringSet.add("S2");
		stringSet.add("S3");
		stringSet.add("S4");
		stringSet.add("S5");
		
		return stringSet;
	}
	
	public static Map<String, String> mapOfNumberToStrings() {
		Map<String, String> stringMap = new HashMap<>(10);
		
		stringMap.put("1", "One");
		stringMap.put("2", "Two");
		stringMap.put("3", "Three");
		stringMap.put("4", "Four");
		stringMap.put("5", "Five");
		
		return stringMap;
	}
}
