package com.github.curriculeon;

public class MyObject implements Runnable {
    public void run() {
        Person p1 = new Person ("James", "Choi");
        System.out.println(p1);
    }
}
