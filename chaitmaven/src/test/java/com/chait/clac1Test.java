package com.chait;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class clac1Test {

              clac1 c1;

//         this @Nested anno used to test class inside class
//        disable is used ti disable this and not execute
        @Disabled
        @Nested
        @DisplayName("inside clac class")
        class InCalc1
        {
            clac1 c;
            @Test
            void add() {
                c=new clac1();
                assertEquals(3,c.add(1,2));
            }

            @Test
            void sub()
            {
                c=new clac1();
                assertEquals(5,c.sub(10,5));
            }
        }

    @Test
    void add() {
        c1=new clac1();
        assertEquals(3,c1.add(1,2));
    }

//    @RepeatedTest(n) is used to repead this n time
    @RepeatedTest(3)
    @DisplayName("sub method")
//    RepetitionInfo is used to check no of repetition and we can change value on any repetition
    void sub(RepetitionInfo repetitionInfo)
//  void sub()
    {
        if(repetitionInfo.getCurrentRepetition()==2) {
//            run only for second repetition
            c1 = new clac1();
            assertEquals(5, c1.sub(10, 5), "Sub operation fail ");
        }
        else
            {
                c1 = new clac1();
                assertEquals(5, c1.sub(44, 5), "Sub operation fail ");
            }
    }

    @Test
    void divide() {
    }
}