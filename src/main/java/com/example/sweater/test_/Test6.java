package com.example.sweater.test_;

public class Test6 {
    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max"));

        System.out.println(aDog.getName().equals("Fifi"));

        System.out.println(aDog.getName().equals(oldDog.getName()));

    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d.setName("Fifi");
//        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
    }
}
