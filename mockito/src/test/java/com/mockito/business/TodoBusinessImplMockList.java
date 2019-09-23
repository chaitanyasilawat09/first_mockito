package com.mockito.business;

import com.mockito.data.api.TodoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockList {

    @Test
    public void MockList()
    {
//        mock list.class
      List listMock=mock(List.class);
//      when() is called so return then() values, can pass more than one valuse of then() for single when()
//        when(listMock.size()).thenReturn(5);
        when(listMock.size()).thenReturn(5).thenReturn(6);
      assertEquals(5,listMock.size());
        assertEquals(6,listMock.size());
    }

    @Test
    public void MockListGet()
    {
//        mock list.class
        List listMock=mock(List.class);
//this is Argument matcher
        when(listMock.get(0)).thenReturn("chait").thenReturn("slaw");
        assertEquals("chait",listMock.get(0));
        assertEquals("slaw",listMock.get(0));
    }

    @Test(expected = NullPointerException.class)
    public void MockListException()
    {
//   mock list.class
        List listMock=mock(List.class);
//  WHEN() called then THENTRROW() throws an exception
//   anyInt() is apply for any Int value .also have anyBoolen,anyString etc
        when(listMock.get(anyInt())).thenThrow(new NullPointerException("SOmething runs"));
//   mockito does not allow combination of matchers and hard coded value like "(listMock.get(anyInt(),5))"
//   when(listMock.get(anyInt(),5)).thenThrow(new NullPointerException("SOmething runs"));
      listMock.get(0);
      listMock.get(1);
    }



}
