package com.learning.collection.hashmap;

/**
 * Created by bheemivasu on 11-05-2017.
 */
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Iterator;
//import java.util.Set;

import java.util.*;

public class Details {

    public static void main(String args[]) {

      /* This is how to declare HashMap */
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
        hm.put(1001, "vasu");
        hm.put(1002, "rihu");
        hm.put(1002, "raj");
        hm.put(1711, "ram");
        hm.put(1223, "rrr");
        hm.put(12122, "vasuvasu");

      /* Display content using Iterator*/
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println("HashMap Integer and String values::");
            System.out.println("key is: " + map.getKey() + " & Value is: " + map.getValue());
        }


    }
}
