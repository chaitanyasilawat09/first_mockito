package com.mockito.business;

import com.mockito.data.api.TodoService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMock_BDD {
    @Before
   public void setUp() {
        System.out.println("Before");
    }
    @After
    public void tearDown() {
        System.out.println("After");
    }

//    -----------------------------BDD----------------------------
@Test
public void test() {

        //        GIVEN
    TodoService todoService = mock(TodoService.class);
    List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Spring Boots","Learn to Dance");
    when(todoService.retrieveTodos("chait")).thenReturn(todos);

    //    WHEN
   int FirstElement= todos.size();


      //    THEN
    assertThat(FirstElement,is(4));
    assertEquals("test fail,actual not equal to expected", 5, todos.size());

}


}
