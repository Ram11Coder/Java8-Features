package com.java8.stream.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    //In the below approach problem is there is some effect involved in converting Wrapper class into primary value
   public static int sumOfNumbers(List<Integer> integerList){

       return integerList.stream().reduce(0,(a,b) ->a+b);//unboxing to convert wrapper to primary
   }

    public static int sumOfNumbersWithIntStream(){

        return IntStream.rangeClosed(1,6).sum();
    }

    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumOfNumbers(list));
        System.out.println(sumOfNumbersWithIntStream());
    }
}
