package com.java8.lambdas;

import java.util.Comparator;

/**
 * () -> {}
 * Lambda is equivalent to a function (method) without a name
 * () - method parameters
 * -> is a seprator of method parameters and body
 * {} -> method body
 *
 */
public class LambdaExample {
    public static void main(String[] args) {
        runnabeleInterfaceExample();
        comparatorExample();
    }

    private static void comparatorExample() {
/**
 * Return 0 if both value are same(a==b)
 * return 1 (a>b)
 * return -1 (a<b)
 */
        Comparator<Integer> comp=new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of compare is : "+  comp.compare(3,2));

        //Lambda way
Comparator<Integer> compLambda=(o1,o2)->o1.compareTo(o2);

        System.out.println("Result of compare is : "+  compLambda.compare(3,2));
    }

    private static void runnabeleInterfaceExample() {
        //Legacy way

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 1");
            }
        };

        //calling runable via thread
        new Thread(runnable).start();



         // Lambda way
Runnable runnableLambda= () -> {
    System.out.println("Runnable 2");
};
new Thread(runnableLambda).start();


// more concise way
        new Thread(()-> System.out.println("runnable 3")).start();

    }
}
