package com.learning.collections.arrays;

/**
 * Created by bheemivasu on 18-04-2017.
 */
public class ArraysExamplesNew {

    //array declaration
    static String[] studentNames;

    //array Initialization
    static int[] classRollNumbers = new int[5];
    static double[] slary = new double[3];
    float[] marks ;

    public static void testRollNum() {
        classRollNumbers[0] = 121;
        classRollNumbers[1] = 122;
        classRollNumbers[2] = 123;
        classRollNumbers[3] = 124;
        classRollNumbers[4] = 125;
        System.out.println("length=" + classRollNumbers.length);
        for (int i = 0; i < classRollNumbers.length; i++) {
            System.out.println("RollNums==" + classRollNumbers[i]);

        }
    }

    public static void testdouble() {
        slary[0] = 12133214;
        slary[1] = 12133214;
        slary[2] = 12133214;
        System.out.println("double length=" + slary.length);
        for (int i = 0; i < slary.length; i++) {
            System.out.println("salary==" + slary[i]);

        }

    }

    public static void testsArrayConcepts() {
        studentNames = new String[5];

        studentNames[0] = "vasu";
        studentNames[1] = "vasu";
        studentNames[2] = "vasu";
        studentNames[3] = "vasu";
        studentNames[4] = "vasu";
        System.out.println("array length=" + studentNames.length);

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("array=" + studentNames[i]);
        }


    }
    public static void getNames(){
        String[] names=new String[3];
        names[0]="raj";
        names[1]="rihu";
        names[2]="vasu";
        System.out.println("length=="+names.length);
        for (int i = 0; i <names.length ; i++) {
            System.out.println("namessss=="+names[i]);

        }

    }

    public static void main(String[] args) {
        testsArrayConcepts();
        testRollNum();
        testdouble();
        getNames();

    }

}
