package com.example.sweater.test_;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.function1();
        Test2.function1(1);

    }
    public void function1(){
        System.out.println("fun 1");
    }
    static void function1(int a){
        System.out.println("fun 1 static");
    }

    public static void function2(){
        System.out.println("fun 2");
    }
}
