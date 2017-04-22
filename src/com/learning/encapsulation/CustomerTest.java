package com.learning.encapsulation;

/**
 * Created by bheemivasu on 22-04-2017.
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setCustomerName("vasuReddy");
        customer.setCustomerAge(25);
        customer.setMobileNum(2344566);
        customer.setAddress("hyd");
        customer.setSalary(20000);
        System.out.println("customer name="+customer.getCustomerName());
        System.out.println("customer age="+customer.getCustomerAge());
        System.out.println("customer mobilenumber="+customer.getMobileNum());
        System.out.println("customer address="+customer.getAddress());
        System.out.println("customer salary="+customer.getSalary());
    }
}
