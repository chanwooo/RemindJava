package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Boj17608Test {
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Test
    void case1() {

//        String testCase = "6\n" +
//                "6\n" +
//                "9\n" +
//                "7\n" +
//                "6\n" +
//                "4\n" +
//                "6";
        String testCase = "6 6 9 7 6 4 6";

        provideInput(testCase);

        Boj17608.main(new String[0]);

        assertEquals(3, Integer.parseInt(getOutput()));

    }

    @Test
    void case2() {
        String testCase = "5\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1";
        provideInput(testCase);

        Boj17608.main(new String[0]);

        assertEquals(5, Integer.parseInt(getOutput()));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private String getOutput() {
        return testOut.toString().strip();
    }
}