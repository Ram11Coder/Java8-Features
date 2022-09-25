package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * skip(n) -> skip the n elements in the stream (or create the sub stream of un skipped elements )
 * Limit(n) -> Limit the n elements in the stream (or create the sub stream of n elements )
 */
public class StreamSkipAndLimitExample {
    public static Optional<Integer> limit(List<Integer> list){

        return  list.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> list){

        return  list.stream()
                .skip(2)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
Optional<Integer> limit=limit(list);
if(limit.isPresent())
        System.out.println("limit : "+limit.get());

        Optional<Integer> skip=skip(list);
        if(skip.isPresent())
            System.out.println("skip : "+skip.get());

    }
}
