package com.learning.collection.hashset;

import java.util.HashSet;

public class HashSetTopic {
	/**
	 * 1)hashSet need Declaration
	 * 2)specific dataType
	 * 3)hashSet will not allow duplication of values
	 * 4)hashSet doesn't follow the order
	 * 4)hashSet is dynamic Size,not fixed length
	 * 5)can add many data and also we can remove by index or value
	 */
	//declare string set
	HashSet<String> names=new HashSet<String>();

	public void getNames(){
		names.add("raj");
		names.add("raj");
		names.add("vasu");
		names.add("rihu");
		names.add("rihu");
		
	    System.out.println(names);
		System.out.println("hashset size="+names.size());
		
		
//		for (int i = 0; i < names.size(); i++) {
//			
//		}
	}

}
