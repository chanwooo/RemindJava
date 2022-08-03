package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StringConcat {
    public static void main(String[] args) {
        System.gc();
        Runtime r = Runtime.getRuntime();
        System.out.println(" 힙 메모리" + r.totalMemory());
        long firstMemorySize = r.freeMemory();
        System.out.println("가용한 힙 메모리" + firstMemorySize);


//        Object[] o = new Object[10000];
        String s = "AAA";
        for(int i = 0 ; i < 10000 ; i++){
//            o[i] = new StringBuilder();
            s+="B";
        }
        System.out.println("s = " + s);





        long lastMemorySize = r.freeMemory();
        System.out.println("객체 생성 후 가용한 힙 메모리" + lastMemorySize);
        System.out.println("Object 객체 하나의 메모리 크기는 " + (firstMemorySize - lastMemorySize)/10000);
    }

}
