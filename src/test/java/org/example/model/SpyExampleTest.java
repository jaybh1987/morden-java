package org.example.model;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.Map;


public class SpyExampleTest {


    @Test
    public void spyExampleTest() {

        Map<String, String> hashMap = new HashMap<String, String>();
        Map<String, String> hashMapSpy = spy(hashMap);

        hashMapSpy.get("key");
        hashMapSpy.put("key", "A value");
        System.out.println(hashMapSpy.get("key"));

        when(hashMapSpy.get("key")).thenReturn("Another value");

        System.out.println(hashMapSpy.get("key"));


    }
}
