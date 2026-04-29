package org.example.test;

import org.example.model.modelToTest.Demo;
import org.junit.jupiter.api.Test;

class DemoTest {

    @Test
    void test() {
        int a = 5;
        assert a == 5 : "a should be 5";
    }

    @Test
    void checkItReturnsNameWhenSet() {
        String name = "John";
        Demo demo = Demo.of(name);

        assert demo.getName().equals(name) : "Name should be " + name;
    }


}

