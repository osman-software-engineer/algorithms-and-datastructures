package org.datastructures.linear.linkedlist;


/**
 * This class represents Linked List ADT Implementation in Java.
 *
 * @author Osman Mohammed
 */

public class LinkedListImplementation {
    public int size;
    private Node head;

    /**
     * Use this method to end item to end of the linked List
     *
     * @param item : providing values for item
     */
    public void addLast(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;

        }
        size++;
    }

    /**
     * Use this method to end item to front of the linked List
     *
     * @param item : providing values for item
     */
    public void addFirst(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
        size++;
    }

    /**
     * Use this method to get index of a item
     *
     * @param item : providing values for item
     * @return : index of item
     */
    public int indexOf(int item) {
        int index = 0;
        if (head == null) {
            return -1;
        } else {
            Node current = head;
            while (current.data != item) {
                current = current.next;
                index++;
            }
        }
        return index;
    }

    /**
     * Use this method to check Linked List contains given data or not.
     *
     * @param item : providing values for item
     * @return : boolean value of item
     */
    public boolean contains(int item) {
        if (head == null) {
            return false;
        } else {
            Node current = head;
            while (current != null) {
                if (current.data == item) {
                    return true;
                }
                current = current.next;

            }
        }
        return false;
    }

    /**
     * use this method to print data in linked list
     */
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println("##############################");
    }

    /**
     * Inner class to represent node
     */
    class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}
