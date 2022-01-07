package com.example.sweater.test_;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        new Random().ints().limit(10).forEach(System.out::println);
        LocalDate now = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(now);
        System.out.println(localTime);
    }
}
