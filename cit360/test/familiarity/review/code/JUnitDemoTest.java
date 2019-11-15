/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


/**
 *
 * @author cobyc
 */
public class JUnitDemoTest {
    
    JUnitDemo jUnitDemo;
    JUnitDemo testJUnitDemo;
    
    public JUnitDemoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {        
        System.out.println("Setting up for the JUnitDemo Test.\n");
        jUnitDemo = new JUnitDemo();
        testJUnitDemo = new JUnitDemo();
        testJUnitDemo = jUnitDemo;
        
    }
    
    @After
    public void tearDown() {
        System.out.println("Tearing down the JUnitDemo Test");
        jUnitDemo = null;
        testJUnitDemo = null;
    }

    @Test
    public void testMethods() {
        String expResult = "This is a test string for the JUnit test.";
        String result = jUnitDemo.getString();
        /*
        The following line will make the assertEquals fail:
        result = "This will fail.";
        */
        System.out.println("Test for string AssertEquals\n");
        Assert.assertEquals(result, expResult, result);
        int[] expected = new int[]{1,2,3,4,5};
        int[] listresult = jUnitDemo.getList();
        /*
        Inserting the following line will make the test fail:
        int[] listresult = null;
        */
        System.out.println("Testing AssertArrayEquals\n");
        assertArrayEquals(expected, listresult);
        System.out.println("Testing for AssertFalse\n");
        boolean testBool = true;
        String falseString = "This should make it false";
        /*
        Inserting the following line makes it fail the test:
        String falseString = "This is a test string for the JUnit test.";
        */
        if (falseString == result)
        {
           testBool = true;
        }
        else
        {
            testBool = false;
        }
        assertFalse(testBool);
        System.out.println("Testing for AssertTrue\n");
        /*
        Inserting the following line makes it fail the test:
        String falseString = "This is a test string for the JUnit test.";
        */
        if (falseString == result)
        {
           testBool = false;
        }
        else
        {
            testBool = true;
        }
        assertTrue(testBool);
        System.out.println("Asserting that the received string isn't null.\n");
        /*
        If the following code is inserted, this fails the test:
        System.out.println("Making the string null.\n");
        result = null;
        */
        assertNotNull(result);
        System.out.println("Checking a null variable.\n");
        String nullVar = null;
        /*
        If the code below is used instead, it will fail the test:
        String nullVar = "This is no longer null.";
        */
        assertNull(nullVar);
        System.out.println("Verifying that the Object is what we're expecting.\n");
        /*
        If you insert the code below, this will fail:
        testJUnitDemo = null;
        */
        assertSame(jUnitDemo,testJUnitDemo);
        System.out.println("Testing NotSame assertion.\n");
        //Commenting the following line out will make the test fail.
        testJUnitDemo = null;
        assertNotSame(jUnitDemo, testJUnitDemo);
        System.out.println("Testing AssertThat.\n");
        /*
        If you were to add this code, the assert statement below would fail:
        result = null;
        */
        assertThat(result, isA(String.class));
    }
    
}
