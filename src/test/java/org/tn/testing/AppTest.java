package org.tn.testing;




import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
        @BeforeAll
        static void setup(){
            System.out.println("@BeforeAll executed");
        }

        @BeforeEach
        void setupThis(){
            System.out.println("@BeforeEach executed");
        }

        @AfterEach
        void tearThis(){
            System.out.println("@AfterEach executed");
        }

        @AfterAll
        static void tear(){
            System.out.println("@AfterAll executed");
        }

        @Test
        void testCalcOne()
        {
            System.out.println("======TEST ONE EXECUTED=======");

        }

        @Test
        void testCalcTwo()
        {
            System.out.println("======TEST TWO EXECUTED=======");
            //Assertions.assertEquals( 6 , Calculator.add(2, 4));
        }

}