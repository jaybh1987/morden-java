package org.example.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DemoTest {

    @Test
    public void mytest(){
        Set mockSet = mock(Set.class);
        Set<String> toAdd = new HashSet<String>();

        mockSet.addAll(toAdd);
        mockSet.clear();;

        verify(mockSet).addAll(toAdd);
        verify(mockSet).clear();

    }

    //Stud method call
    @Test
    public void myStubTest() {

        //mocking (mocking the set class)
        Set mockSet = mock(Set.class);

        //stubbing (setting the behaviour)
        when(mockSet.size()).thenReturn(10);

        Assert.assertEquals(10, mockSet.size());
    }

    @Test
    public void mySpyTest() {
        /*
        * Spy is partial mocking, it creates spy of the real object and call read method unless stubbing are done.
        * User Spy carefully and occasionally where there is no way to test.
        * Sometime it is impossible or impractical to use when(object) for stubbing spies.
        * Hence, for spies it is recommanded to always use
        * - doReturn
        * - Answer
        * - Throw()
        * - CallRealMethod family of methods for stubbing.
        * */

        List list = new LinkedList();
        List spy = spy(list); // spy do not use real instance instead make a copy of the instance.

        try{
            when(spy.get(0)).thenReturn("foo");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}