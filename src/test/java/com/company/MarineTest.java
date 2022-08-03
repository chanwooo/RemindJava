package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarineTest {

    @Test
    void testMarine() {
        var marine = new com.company.Marine();
        assertEquals(marine.hp,40);
        assertEquals(marine.moveSpeed,1.8);
        assertEquals(marine.damage,6);
    }

    @Test
    void testMarineWithName() {
        var marine = new com.company.Marine("marine1");
        assertEquals(marine.name, "marine1");
        String a = "AA";
        a.toCharArray();
    }

    @Test
    void testAttack() {
        //마린의 기본체력은 40, 공격력은 6

        //given
        var marine1 = new com.company.Marine("m1");
        var marine2 = new com.company.Marine("m2");
//        var marine1 = testMarine();
//        var marine2 = testMarine();

        //when
        marine1.attack(marine2);

        //then
        assertEquals(marine2.hp, 34);
    }

    @Test
    void testStimPack() {
        var marine1 = new Marine("stim marine");
        marine1.useStimPack();
        assertEquals(marine1.hp, 30);
    }

    @Test
    void moveTest() {
        var marine1 = new Marine();
        Coord pos = new Coord(1.1, 1.1);
        marine1.move(pos);
        assertEquals(marine1.pos.toString(), new Coord(1.1, 1.1).toString());
    }

}


