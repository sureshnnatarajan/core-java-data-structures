package com.suresh.learnings.twentyseventeen.march;

import java.util.HashMap;

public class HashMapDriver {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
		hashMapObj.put("aaa", 1);
		hashMapObj.put("aaa", 2);
		hashMapObj.put("aaa", 3);
		hashMapObj.put("aab", 4);
		
		System.out.println("Size of hashmap-->"+hashMapObj.size());
		
		for (String str : hashMapObj.keySet()) {
			System.out.println("str -->" + str);
		}
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println("Obj1 Hashcode-->" + obj1.hashCode());
		System.out.println("Obj2 Hashcode-->" + obj2.hashCode());
	}

}
