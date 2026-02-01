package org.example;

//import junit.framework.Test;
//import junit.framework.TestCase;
import org.junit.Test;
import java.util.Random;

import junit.framework.TestSuite;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Random random = new Random();

    @Test
    public void test1() {
        int number = random.nextInt(10); // 0-9
        System.out.println("Test1 random number: " + number);
        assertTrue("Test1 passed if number >= 3", number >= 3);
    }

    @Test
    public void test2() {
        int number = random.nextInt(10);
        System.out.println("Test2 random number: " + number);
        assertTrue("Test2 passed if number >= 2", number >= 2);
    }

//    @Test
//    public void test3() {
//        int number = random.nextInt(10);
//        System.out.println("Test3 random number: " + number);
//        assertTrue("Test3 passed if number >= 5", number >= 5);
//    }
//
//    @Test
//    public void test4() {
//        int number = random.nextInt(10);
//        System.out.println("Test4 random number: " + number);
//        assertTrue("Test4 passed if number >= 1", number >= 1);
//    }
//
//    @Test
//    public void test5() {
//        int number = random.nextInt(10);
//        System.out.println("Test5 random number: " + number);
//        assertTrue("Test5 passed if number >= 4", number >= 4);
//    }
}
