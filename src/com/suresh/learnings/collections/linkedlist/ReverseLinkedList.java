package com.suresh.learnings.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

	private static LinkedList<String> linkedList = new LinkedList<>();
	
	public static void main(String[] args) {

		populateLinkedList();
		
		printLinkedList();
		
		printReverseLinkedList();
	}

	private static void populateLinkedList() {
		/*linkedList.add("Suresh");
		linkedList.add("Shubi");
		linkedList.add("Mithran");*/
		
		linkedList.addFirst("Suresh");
		linkedList.add("Shubathara");
		linkedList.addLast("Shreemithran");
	}

	private static void printReverseLinkedList() {

		Iterator reverse = linkedList.descendingIterator();
		
		System.out.println("Printing reverse contents ===>");
		while(reverse.hasNext()) {
			System.out.println(reverse.next());
		}
	}

	private static void printLinkedList() {
		//Java 8
		System.out.println("Java 8 : printing");
		linkedList.forEach(str -> System.out.println(str));
		
		//Java 7
		System.out.println("Java 7 : printing");
		for (String str : linkedList) {
			System.out.println(str);
		}
	}
}
