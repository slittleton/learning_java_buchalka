package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapExamples {

    public static void main(String[] args) {
        Map<String, String> strings = new HashMap<>();
        strings.put("a", "aa");
        System.out.println(strings.get("a"));

        Map<String, String> map = Stream.of(new String[][]{
                {"Hello", "World"},
                {"John", "Doe"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        System.out.println(map.get("Hello"));
        System.out.println(map.keySet());
        System.out.println(map.toString());
        System.out.println(map.entrySet());
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
