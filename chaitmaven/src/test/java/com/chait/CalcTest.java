package com.chait;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CalcTest {

    @BeforeEach
    void before()
    {
        System.out.println("before all methdo");
    }

    @AfterAll
   static void after()
    {
        System.out.println("after All method");
    }

    @Test
//     @DISPLAYNAME is use to show method name at consol at the time of testing
    @DisplayName("TESTMETHOD OF CALC CLASS")
    void test() {
        System.out.println("test is run ");

    }
    @Test
    void calc()
    {
        Calc c=new Calc();
        int expected =9;
        int actual= c.add(3,6);
        assertTrue(expected==actual,"expected "+expected+" but actual is "+actual);
    }

    @Test
    void testComputeCircleredius()
    {
        Calc c=new Calc();
        assertEquals(314.1592653589793,c.computeCircleArea(10.0),"Please insert correct radius");
    }

    @Test()
    void Divied()
    {
//        Test true if assertThrows ArithmeticException else test fails
        Calc c1=new Calc();
        assertThrows(ArithmeticException.class,()  -> c1.divide(1,0));
    }

    @Test
    void testdisabled()
//            assumeTrue(true)= we assume that this is true ans execute it if false so not ec=xecute this method
    {   assumeTrue(false);
        fail("test method disable is apply ");
    }


    @Test
    void add()
    {
//        In this we can use more than assert  with help of Lmbd
        Calc c=new Calc();
        assertAll(   () -> assertEquals(24,c.multiple(7,6)),
                    () -> assertEquals(12,c.divide(144,12))
                 );

    }

}