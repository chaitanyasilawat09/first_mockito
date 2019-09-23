package com.mockito.business;

import com.mockito.data.api.TodoService;
import com.mockito.data.stub.TodoServiceStub;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTestTest {

    @Test
    public void test() {
        TodoService todoService = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Spring Boots",
                "Learn to Dance","Learn Spring MVC", "Learn Spring", "Spring Boots", "Learn to Dance");
        when(todoService.retrieveTodos("chait")).thenReturn(todos);
        assertEquals("test fail,actual not equal to expected", 8, todos.size());

    }
       @Test
       public void test1(){
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos1 = todoBusinessImpl.retrieveTodosRelatedToSpring("chait");
        assertEquals("test1 fail,actual not equal to expected",3, todos1.size());
    }

}
