package com.ibm.demo.day3.collectionsdemos;


import java.util.ArrayList;
import java.util.List;

public class CollectionAndGenericsDemo {

	public static void main(String[] args) {

//		List myFriends = new ArrayList();
//		ArrayList myFriends = new ArrayList();
//		List<String> myFriends = new ArrayList<String>();
		List<String> myFriends = new ArrayList<>();

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
//		myFriends.add(10.50);
//		myFriends.add(20);
//		myFriends.add(false);
		System.out.println("size " + myFriends.size());
		System.out.println(myFriends);
//		myFriends.
		

		

	}

}
