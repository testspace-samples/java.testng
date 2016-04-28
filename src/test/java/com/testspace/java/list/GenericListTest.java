package com.testspace.java.list;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class GenericListTest
{
    private int capacity;
    private int nonPositiveCapacity;
    private int position;
    private Object element;
    private GenericList list;

    @BeforeTest
    public void setUp()
    {
        capacity = 1;
        nonPositiveCapacity = -1;
        position = 1;
        element = "test";
    }

    @Test
    public void testGenericListDefaultConstructor()
    {
        GenericList list = new GenericList();
        assertNotNull(list);
        assertEquals(list.size(), 0);
    }

    @Test
    public void testGenericListPamaterizedConstructor()
    {
        GenericList list = new GenericList(capacity);
        assertNotNull(list);
        assertEquals(list.size(), 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGenericListPamaterizedConstructorWithNonPositiveCapacity()
    {
        GenericList list = new GenericList(nonPositiveCapacity);
    }

    @Test
    public void testSize()
    {
        GenericList list = new GenericList();
        list.add(element);
        assertEquals(list.size(), 1);
    }

    @Test
    public void testGetElement()
    {
        GenericList list = new GenericList();
        list.add(element);
        assertEquals(list.get(0), element);
    }

    @Test
    public void testAddElement()
    {
        GenericList list = new GenericList();
        list.add(element);
        assertEquals(list.size(), 1);
        assertEquals(list.get(0), element);
    }

    @Test
    public void testInsertElement()
    {
        GenericList list = new GenericList();
        list.add(element);
        list.add(element);
        int size = list.size();
        list.insert(1, "inserted");
        assertEquals(list.size(), size + 1);
        assertEquals(list.get(1), "inserted");
    }

    @Test
    public void testRemoveElement()
    {
        GenericList list = new GenericList();
        list.add(element);
        int size = list.size();
        assertEquals(list.remove(0), element);
        assertEquals(list.size(), size - 1);
    }

    @Test
    public void testToStringWithEmptyList()
    {
        GenericList list = new GenericList();
        assertEquals(list.toString(), "size: 0, elements: []");
    }

    @Test
    public void testToString()
    {
        GenericList list = new GenericList();
        list.add(element);
        list.add(element);
        assertEquals(list.toString(), "size: 2, elements: [test, test]");
    }

    @Test
    public void testToStringUsingStringBufferWithEmptyList()
    {
        GenericList list = new GenericList();
        assertEquals(list.toStringUsingStringBuffer(), "size: 0, elements: []");
    }

    @Test
    public void testToStringUsingStringBuffer()
    {
        GenericList list = new GenericList();
        list.add(element);
        list.add(element);
        assertEquals(list.toStringUsingStringBuffer(), "size: 2, elements: [test, test]");
    }

    @Test
    public void testEqualsNull()
    {
        GenericList list = new GenericList();
        assertEquals(list.equals(null), false);
    }

    @Test
    public void testEqualsDifferentClasses()
    {
        GenericList list = new GenericList();
        Object obj = new Object();
        assertEquals(list.equals(obj), false);
    }

    @Test
    public void testEqualsSameReference()
    {
        GenericList list = new GenericList();
        GenericList refList = list;
        assertEquals(list.equals(refList), true);
    }

    @Test
    public void testEqualsDifferentInstances()
    {
        GenericList list = new GenericList();
        list.add(element);
        GenericList anotherList = new GenericList();
        anotherList.add(element);
        assertEquals(list.equals(anotherList), true);
    }
}
