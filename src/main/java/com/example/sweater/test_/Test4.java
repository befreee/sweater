package com.example.sweater.test_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple","Mango","Grapes"));
        System.out.println("Data before calling method = " + fruits.toString());
        processData(fruits);
        System.out.println("Data after calling method = " + fruits.toString());
        processData2(fruits);
        System.out.println("Data after calling second method = " + fruits.toString());
    }

    private static void processData(List<String> fruitsRes){
        fruitsRes.add("Orange");
    }
    private static void processData2(List<String> fruitsRes2){
        fruitsRes2 = new ArrayList<>(fruitsRes2);
        fruitsRes2.add("Cherry");
    }
}
