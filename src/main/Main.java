package main;

import test.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.sub(3, 5));
        System.out.println(test.nul(7, 8));
        System.out.println(test.div(8, 5));
        System.out.println(test.sum(7, 3));
    }
}