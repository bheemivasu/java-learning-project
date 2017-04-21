package com.learning.MethodOverriding;

/**
 * Created by bheemivasu on 21-04-2017.
 */
public class BookChilid extends BookParent {
    public void bookSize(){
        super.booksize();
        System.out.println("Book size is 500 pages");
    }
    public void bookColor(){
        super.bookColor();
        System.out.println("Book color is green");
    }
    public void bookRef(){
        System.out.println("Book ref by google");
    }

    public static void main(String[] args) {
        BookChilid bb=new BookChilid();
        bb.bookSize();
        bb.bookColor();
        bb.bookRef();
        bb.bookType();
    }
}
