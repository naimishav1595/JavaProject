package com.company;

public class Operators {

    public static void main(String args []){

        int a= 10;
        int b= 20;
       // int c= a+b;


        // arithematic operators


        System.out.println("the sum of a and b:"+(a+b));
        System.out.println("the diff of a and b:"+(a-b));
        System.out.println("the product of a and b:"+(a*b));
        System.out.println("the div of a and b:"+(a/b));
        System.out.println("the quo of a and b:"+(a%b));



        //relational operators == < > <= >= !=  it will always return bollen as a result

        System.out.println("the answer is:"+(a==b));
        System.out.println("the answer is:"+(a>b));
        System.out.println("the answer is:"+(a<b));
        System.out.println("the answer is:"+(a!=b));
        System.out.println("the answer is:"+(a>=b));
        System.out.println("the answer is:"+(a<=b));

        //logical operators  && ! ||
       //   and && =
        //   or ! =
        //    ||


        System.out.println("the answer is:"+(a<b && a!=b));


        // incremantal operator


        int d=10;
        d++;
        System.out.println(d);



    }
}
