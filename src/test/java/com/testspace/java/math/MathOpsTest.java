package com.testspace.java.math;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MathOpsTest
{

    private int value1;
    private int value2;


    @BeforeTest
    public void setUp()
    {
        value1 = 3;
        value2 = 5;
    }

    @Test
    public void testAdd1()
    {
        int total = 8;
        int sum = MathOps.add(value1, value2);
        assertEquals(sum, total);
    }

    @Test
    public void testAdd2willFail()
    {
        int total = 8;
        int sum = MathOps.add(value1, value2);
        // force a failure
        sum++;
        assertEquals(sum, total);
    }

    @Test
    public void testAdd3()
    {
        int total = 9;
        int sum = MathOps.add(value1, 0);
        assertEquals(sum, value1);
    }

    @Test
    public void testSub1()
    {
        int total = 0;
        int sub = MathOps.sub(4, 4);
        assertEquals(sub, total);
    }
}
