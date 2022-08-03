package com.company;

import java.util.ArrayList;

public class Main {
    @FunctionalInterface
    interface Testable {
        void run();
    }
    public static void test(Testable param) {
        param.run();
    }
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            int index = i;
//            index = 3;
            Testable case1 = ()->{
                System.out.println("run "+index);
            };
            test(case1);
        }




        // write your code here
        String hello = "Hello?";
        int coeff = 5;
//        hello = "hi"; //error

        for(var i=0; i<5; i++) {
            var result = i;
            HelloInterface obj = new HelloInterface() {
                @Override
                public int countNumber() {
                    return result;
                }
            };

            System.out.println(obj.countNumber());
        }

        ArrayList list = new ArrayList<>();
        for(var i=0; i<5; i++) {
            var result = i;
//            System.out.println(result);
            list.add(result);
            System.out.println(list);

        }


        System.out.println(Multiplier.multiply(2,5));
        System.out.println(Multiplier.multiply(2,5,10));

    }

}

class Multiplier {
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return Multiplier.multiply(a, b) * c;
    }
}

interface HelloInterface {
//    public String sayHello();
    public int countNumber();
}

