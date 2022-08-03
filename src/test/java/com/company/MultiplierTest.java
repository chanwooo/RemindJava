package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @Test
    void multiply_item2() {
        assertEquals(Multiplier.multiply(2,5),10);
    }

    @Test
    void test_multiply_int_args3() {
        assertEquals(Multiplier.multiply(2,5,10),100);
    }
}