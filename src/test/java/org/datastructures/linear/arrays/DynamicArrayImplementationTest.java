package org.datastructures.linear.arrays;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicArrayImplementationTest {
    private DynamicArrayImplementation dynamicArray;

    @BeforeMethod
    public void setUp() {
        dynamicArray = new DynamicArrayImplementation(3);
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testTestInsert() {
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        Assert.assertEquals(dynamicArray.count,4);
    }

    @Test
    public void testRemoveAt() {
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        dynamicArray.removeAt(3);
        Assert.assertEquals(dynamicArray.count,3);
    }

    @Test
    public void testIndexOf() {
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        Assert.assertEquals(dynamicArray.indexOf(40),3);
    }

    @Test
    public void testMax() {
        dynamicArray.insert(10);
        dynamicArray.insert(50);
        dynamicArray.insert(30);
        dynamicArray.insert(60);
        Assert.assertEquals(dynamicArray.max(),60);

    }

    @Test
    public void testReverse() {
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        dynamicArray.reverse();

    }
    @Test
    public void testIntersect() {
        dynamicArray.insert(10);
        dynamicArray.insert(20);
        dynamicArray.insert(30);
        dynamicArray.insert(40);
        int[] result1 = dynamicArray.intersect(new int[]{1,2,3,4,5,6}, new int[]{5,6});
       Assert.assertEquals(result1,new int[]{5,6});
        int[] result2 = dynamicArray.intersect(new int[]{3,4}, new int[]{1,2,3,4,5,6});
        Assert.assertEquals(result2,new int[]{3,4});
    }
}