package com.java8.LamdaLocalVariable;

import java.util.function.Consumer;

public class LocalVarRestriction {
static  int instance=12;
    public static void main(String[] args) {
        /**
         * Lambdas have some restrictions on using local variables:
         * • Not allowed to use the same the local variable name as
         * lambda parameters or inside the lambda body.
         * • Not allowed re-assign a value to a local variable.
         */
    //case 1:
        int i=0;
      //  Consumer<Integer> consumer1=(i) -> System.out.println("val is "+i);//Variable 'i' is already defined in the scope

       //case 2:
        Consumer<Integer> consumer2=(i1) -> {
        //    int i=0;// error : Variable 'i' is already defined in the scope
            System.out.println("val is "+i1);
        };

        //value used inside the lambda is final , so modification is not possible

        int val=1;// local variable inside the method can not modify
        Consumer<Integer> c1=(input) -> {

//val++;//Variable used in lambda expression should be final or effectively final
instance++;//this is ok
            System.out.println(input);
        };

        System.out.println(val);
c1.accept(5);

//instance and class variable able to modify in lambda expression

    }
}
