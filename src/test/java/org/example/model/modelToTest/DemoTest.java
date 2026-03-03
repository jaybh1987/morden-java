package org.example.model.modelToTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    private Demo demo;

    @BeforeEach
    void setDemo() {
        demo = Demo.of("jay");
    }

    @Test
    void getName_Should_Return_String() {
        assertEquals("jay", demo.getName());
    }

    @Test
    void doNotAllow_To_Set_Age_Zero() throws IllegalArgumentException {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> demo.setAge(0));
        assertEquals("Age cannot be zero or >100", ex.getMessage());
    }

    @Test
    void getAgeAlwaysReturnInteger() {
        demo.setAge(11);
        Integer i = demo.getAge();
        assertInstanceOf(Integer.class, i);
    }

    @Test
    void ageCouldNotBeMoreThan100() {

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> demo.setAge(110));

        assertEquals("Age cannot be zero or >100", ex.getMessage());
    }

}
