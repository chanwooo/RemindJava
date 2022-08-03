package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class StringTest {
    @Test
    void test_16비트를넘어가는문자의_길이(){

        String a = "AAAAA";
        Assertions.assertEquals(5, a.length());

        String b = "가나다라마";
        Assertions.assertEquals(5, b.length());

        String c = "\uD83C\uDCA1r";
        System.out.println("c = " + c);
        System.out.println("c.length() = " + c.length());

        String d = "\u0001\uF0A1\uD83D\uDE13";
        System.out.println("d = " + d);
        System.out.println("d.length() = " + d.length());
    }
}
