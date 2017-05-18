package com.learningforever.myapplication.MathPackage;

/**
 * Created by ABCD on 5/13/2017.
 */
public class PrivateAccess {

        static
        {
            System.out.println("class initializer 1");
        }

    static int counter = 1;
    static
        {
            System.out.println("class initializer 2");
            System.out.println("counter = " + counter);
        }
    static
    {
        System.out.println("class initializer 2");
        System.out.println("counter = " + counter);
    }
    static
    {
        System.out.println("class initializer 2");
        System.out.println("counter = " + counter);
    }


}
