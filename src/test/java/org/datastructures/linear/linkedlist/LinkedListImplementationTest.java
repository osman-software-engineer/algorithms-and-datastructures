package org.datastructures.linear.linkedlist;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkedListImplementationTest {
    private LinkedListImplementation linkedList;

    @BeforeMethod
    public void setUp() {
        linkedList = new LinkedListImplementation();
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testAddLast() {
        for (int i = 1; i < 10; i++) {
            linkedList.addLast(i * 10);
        }
        Assert.assertEquals(9, linkedList.size);
    }

    @Test
    public void testAddFirst() {
        for (int i = 1; i < 10; i++) {
            linkedList.addFirst(i * 10);
        }
        Assert.assertEquals(9, linkedList.size);
    }

    @Test
    public void testIndexOf() {
        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.print();
        Assert.assertEquals(0, linkedList.indexOf(1));
    }

    @Test
    public void testContains() {
        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        Assert.assertTrue(linkedList.contains(1));
        Assert.assertTrue(linkedList.contains(4));
        Assert.assertTrue(linkedList.contains(10));
        Assert.assertFalse(linkedList.contains(10));
    }

    @Test
    public void testPrint() {
        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.print();
    }
}
