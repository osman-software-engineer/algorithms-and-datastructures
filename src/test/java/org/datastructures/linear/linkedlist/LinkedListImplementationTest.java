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
        Assert.assertFalse(linkedList.contains(11));
    }

    @Test
    public void testPrint() {
        for (int i = 1; i <= 10; i++) {
            linkedList.addLast(i);
        }
        linkedList.print();
    }

    @Test
    public void testRemoveLast() {
        for (int i = 1; i <= 5; i++) {
            linkedList.addLast(i * 10);
        }
        linkedList.removeLast();
        Assert.assertEquals(4, linkedList.size);
    }

    @Test
    public void testRemoveFirst() {
        for (int i = 1; i <= 5; i++) {
            linkedList.addLast(i * 10);
        }
        linkedList.removeFirst();
        Assert.assertEquals(4, linkedList.size);
    }

    @Test
    public void testToArray() {
        for (int i = 1; i <= 5; i++) {
            linkedList.addLast(i * 10);
        }
        System.out.println(linkedList.toArray());
    }

    @Test
    public void testReverse() {
        for (int i = 1; i <= 1; i++) {
            linkedList.addLast(i * 10);
        }
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}
