package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled, high-level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, high-level, object-oriented, platform independent language");
        languages.put("Algol", "an algorithmic language");
        languages.put("Basic", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");


        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about java");
        }




        if (languages.replace("Lisp", "a programming language") instanceof java.lang.String) {
            System.out.println("replaced");
        }

        // middle param required for checking bool
        if (languages.replace("Lisp", "Therein lies madness", "a programming language")) {
            System.out.println("replaced");
        }


        if(languages.remove("Algol","an algorithmic language")){// second param required if attempting to make bool
            System.out.println("removed Algol");
        }

        // check against null b/c checking without second param gives error - string cant be converted to bool
        if(languages.remove("Lisp") != null){
            System.out.println("removed Lisp");
        }else{
            System.out.println("not removed");
        }


        System.out.println("========================================================");
        printHashMap(languages);
        System.out.println("========================================================");
        languages.remove("Lisp");


    }

    public static void printHashMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
