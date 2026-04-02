package com.ibm.demo.day3.collectionsdemos;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {

		List myFriends = new ArrayList();
//		ArrayList myFriends = new ArrayList();

		System.out.println("size " + myFriends.size());
		System.out.println(myFriends);
		myFriends.add("Sonu");
		myFriends.add("Monu");
		System.out.println("size " + myFriends.size());
		System.out.println(myFriends);
		myFriends.remove(0);
		System.out.println("size " + myFriends.size());
		System.out.println(myFriends);
		myFriends.add("Tonu");
		myFriends.add(10.50);
		myFriends.add(20);
		myFriends.add(false);
		System.out.println("size " + myFriends.size());
		System.out.println(myFriends);
//		myFriends.
		

		

	}

}

//package com.ibm.demo.day3.collectionsdemos;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CollectionDemo {
//
//	public static void main(String[] args) {
//
//		String[] friends = { "Sonu", "Monu", "Tonu" }; // size if fixed, data-type is only one 
//		for (String friend : friends)
//			System.out.println(friend);
////		friends[3] = "Ponu";
//		
////		List, Set, Map, Queue
//		
//		List myFriends = new ArrayList();
//		
//
//	}
//
//}
