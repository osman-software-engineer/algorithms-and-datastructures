package org.datastructures.linear.arrays;

/**
 * This class implements Dynamic Array Data Structure.
 *
 * @author Osman Mohammed
 * @date 6th June 2020
 */
public class DynamicArrayImplementation {
    public int count;
    private int[] dynamicArray;
    private int[] tempArray;

    /**
     * Parameterized constructor
     *
     * @param size : providing value for array size
     */
    public DynamicArrayImplementation(int size) {
        dynamicArray = new int[size];
    }

    /**
     * Use this method to insert elements
     *
     * @param element
     */
    public void insert(int element) {
        //If array is full, resize it and add items
        if (count >= dynamicArray.length) {
            tempArray = new int[count + 1];
            for (int i = 0; i < dynamicArray.length; i++) {
                tempArray[i] = dynamicArray[i];
            }
            dynamicArray = tempArray;
        }
        // If array is not full, add items
        dynamicArray[count] = element;
        // Increment count of elements
        count++;
    }

    /**
     * Use this method to insert element at a given index
     *
     * @param item
     * @param index
     */
    public void insertAt(int item, int index) {
        if (index < 0 || index > dynamicArray.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        dynamicArray[index] = dynamicArray[item];
    }

    /**
     * Use this method to remove elements at a given index
     *
     * @param index
     */
    public void removeAt(int index) {
        //check for valid index
        if (index < 0 || index >= count) {
            throw new ArrayIndexOutOfBoundsException();
        }
        tempArray = new int[count - 1];
        //Shift the items to the left
        for (int i = 0; i < count; i++) {
            if (index == 0 && i <= tempArray.length - 1) {
                tempArray[i] = dynamicArray[i + 1];
            } else if (index > 0 && i < index) {
                tempArray[i] = dynamicArray[i];
            } else if (i >= index && i <= tempArray.length - 1) {
                tempArray[i] = dynamicArray[i + 1];
            }

        }
        dynamicArray = tempArray;
        count--;
    }

    /**
     * Use this me to find index of first occurrence of the element
     *
     * @param element
     * @return
     */
    public int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (dynamicArray[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int[] intersect(int[] thisArray, int[] anotherArray) {
        if (thisArray.length == 0 || anotherArray.length == 0) {
            throw new IllegalArgumentException("Either of thisArray|anotherArray length is 0");
        }
        if (thisArray.length < anotherArray.length) {
            tempArray = new int[thisArray.length];
            for (int i = 0; i < thisArray.length; i++) {
                for (int j = 0; j < anotherArray.length; j++) {
                    if (thisArray[i] == anotherArray[j]) {
                        tempArray[i] = thisArray[i];
                    }
                }
            }
        } else {
            tempArray = new int[anotherArray.length];
            for (int i = 0; i < anotherArray.length; i++) {
                for (int j = 0; j < thisArray.length; j++) {
                    if (anotherArray[i] == thisArray[j]) {
                        tempArray[i] = anotherArray[i];
                    }
                }
            }
        }

        return tempArray;
    }

    /**
     * Use this method to reverse the Dynamic Array
     */
    public void reverse() {
        //check for valid index
        if (count == 0) {
            throw new IllegalArgumentException("Array is Empty");
        }
        tempArray = new int[dynamicArray.length];
        for (int i = dynamicArray.length - 1, j = 0; i >= 0; i--, j++) {
            tempArray[j] = dynamicArray[i];
        }
        dynamicArray = tempArray;
    }

    /**
     * @return
     */
    public int max() {
        int maxValue = 0;
        for (int i = 0; i < count; i++) {
            if (maxValue < dynamicArray[i]) {
                maxValue = dynamicArray[i];
            }
        }
        return maxValue;
    }

    /**
     * Use this method to print elements of Dynamic Arrays
     */
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
    }
}
