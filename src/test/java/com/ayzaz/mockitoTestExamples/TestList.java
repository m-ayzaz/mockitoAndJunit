package com.ayzaz.mockitoTestExamples;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestList {

    @Test
    public void returnsMultipleValues(){

        List mockList = mock(List.class);
        when(mockList.size()).thenReturn(1).thenReturn(2);

        assertEquals(1, mockList.size());
        assertEquals(2, mockList.size());
    }

    @Test
    public void mockListGet(){
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Test");
        assertEquals("Test",mockList.get(0));

    }
}
