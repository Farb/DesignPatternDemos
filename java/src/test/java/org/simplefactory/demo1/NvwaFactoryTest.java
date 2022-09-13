package org.simplefactory.demo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NvwaFactoryTest {

    @Test
    void createPersonTest() {
        Person man = NvwaFactory.createPerson("M");
        assertTrue(man instanceof Man);
        Person woman = NvwaFactory.createPerson("W");
        assertTrue(woman instanceof Woman);
        Person robot = NvwaFactory.createPerson("R");
        assertTrue(robot instanceof Robot);
    }
}