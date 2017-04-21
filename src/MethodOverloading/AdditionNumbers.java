package MethodOverloading;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by bheemivasu on 21-04-2017.
 */
public class AdditionNumbers {
    public int num(){
        int x=10;
        int y=20;
        int z=x+y;
        return z;

    }
    public double sum( double x,double y){
        return (x+y);

    }
public String sum(String a,String b){
        return (a+b);
}

    public static void main(String[] args) {
        AdditionNumbers ad=new AdditionNumbers();
        ad.num();
        System.out.println(ad.sum(120.1,120.1));
        System.out.println(ad.sum("vasu","reddy"));
        System.out.println(ad.num());

    }
}
