package com.company;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Boj17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int inputCount = sc.nextInt();
        List<Integer> inputData = new ArrayList<>();
        for(int i=0; i<inputCount; i++) {
            inputData.add(sc.nextInt());
        }
        Collections.reverse(inputData);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        for(int data : inputData) {
            if(stack.peek()<data) {
                stack.add(data);
            }
        }
//        System.out.println("stack = " + stack);
        System.out.println(stack.size()-1);

    }
}
