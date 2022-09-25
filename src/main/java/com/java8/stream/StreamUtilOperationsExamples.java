package com.java8.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamUtilOperationsExamples {
    public static void main(String[] args) {
//Factory methods
        //Stream.of() method  to generation Stream of object
     Stream<String> stringStream=   Stream.of("Rocky","bhai","cool");
     stringStream.forEach(System.out::println);

     // iterate method will produce the infinite no of sequence we can use limit to limit the values
     Stream.iterate(1, x-> x*2).limit(10).forEach(System.out::println);


     // Generate method will produce the infinite of stream which take the input as supplier interface

      //  Supplier<Integer> integerSupplier=() ->  new Random().nextInt();
        Supplier<Integer> integerSupplier1=new Random()::nextInt;
         Stream.generate(integerSupplier1)
                    .limit(5)
                     .forEach(System.out::println);

    }
}
