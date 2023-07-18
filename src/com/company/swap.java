package com.company;

public class swap {

    public static void main(String args[]){

        int x= 1;
        int y = 2;

        System.out.println("before swapping:x=" +x+ "y=" +y);

        x = x+y;
        y= x-y;
        x = x-y;

        System.out.println("after swapping:x=" +x+ "y=" +y);

    }
}
