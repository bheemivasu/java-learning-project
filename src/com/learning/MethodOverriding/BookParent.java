package com.learning.MethodOverriding;

/**
 * Created by bheemivasu on 21-04-2017.
 */
public class BookParent {
    public void booksize(){
        System.out.println("book size is 100pages");
    }
    public void bookColor(){
        System.out.println("book color is white");
    }
    public void bookType(){
        System.out.println("book type is parent");
    }

    public String getMyBookName(String mybookname){
        return mybookname;
    }
}
