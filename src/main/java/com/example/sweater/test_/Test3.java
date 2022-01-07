package com.example.sweater.test_;

public class Test3 {
    public static void main(String[] args) {
        Integer val = new Integer(123);
        System.out.println("Data before calling method = " + val);
        doSome2(val);
        System.out.println("Data after calling method =  " + val);

    }

    private static void doSome2(Integer val) {
        val = new Integer(456);
    }
}
