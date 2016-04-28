package com.testspace.java.string;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class StringOpsTest
{

    private String sL;
    private String sR;
    private String sEmpty;

    @BeforeTest
    public void setUp()
    {
        sL = "left";
        sR = "right";
        sEmpty = "";
    }

    @Test
    public void testConcat1()
    {
        String sOut = StringOps.concat(sL, sR);
        assertEquals("leftright", sOut);
    }

    @Test
    public void testConcat2()
    {
        String sOut = StringOps.concat(sEmpty, sL);
        assertEquals(sOut, "left");
    }

    @Test
    public void testConcat3()
    {
        String sOut = StringOps.concat(sL, sEmpty);
        assertEquals(sOut, "left");
    }

    @Test
    public void testReverse1()
    {
        String sOut = StringOps.reverse(sEmpty);
        assertEquals(sOut, sEmpty);
    }

    @Test
    public void testReverse2()
    {
        String sOut = StringOps.reverse("dcba");
        assertEquals(sOut, "abcd");
    }

    @Test
    public void testReverse3WillFail()
    {
        String sOut = StringOps.reverse("edcba");
        assertEquals(sOut, "abcd");
    }
}
