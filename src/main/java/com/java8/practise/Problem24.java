package com.java8.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Sorted the map based on their values

/**
 * Reference:
 *
 *    Collector<T, ?, M> toMap(Function<? super T, ? extends K> keyMapper,
 *                                 Function<? super T, ? extends U> valueMapper,
 *                                 BinaryOperator<U> mergeFunction,
 *                                 Supplier<M> mapSupplier)
 *
 keyMapper – a mapping function to produce keys
 valueMapper – a mapping function to produce values
 mergeFunction – a merge function, used to resolve collisions between values associated with the same key, as supplied to Map.merge(Object, Object, BiFunction)
 mapSupplier – a function which returns a new, empty Map into which the results will be inserted
 */
public class Problem24 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 2);
        map.put("c", 1);
        System.out.println("Before sorting : \n" + map);

        LinkedHashMap<String, Integer> sortedMapByValue = map.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue() - o2.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("After sorting : \n" + sortedMapByValue);





    }
}
