package com.mockito.business;

import com.mockito.data.api.TodoService;
import com.mockito.data.stub.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {
    @Test
    public void usingAStub() {
//        here create object of STUB,pass this to BusinessImpl class Object
//        In this We have to create STUB class every time
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");
        assertEquals("test fail,actual not equal to expected",4, todos.size());
    }

}
