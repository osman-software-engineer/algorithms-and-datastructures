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
     * Use this method to remove last item in linked
     */
    public void removeLast() {
        if (head == null) {
            throw new IllegalArgumentException("List is already empty, cannot remove anything");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            size--;

        }
    }

    /**
     * Use this method to remove first item in linked
     */
    public void removeFirst() {
        if (head == null) {
            throw new IllegalArgumentException("List is already empty, cannot remove anything");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node previous = null;
            Node current = head;
            Node next = current.next;
            current.next = null;
            head = next;
            size--;
        }
    }

    /**
     * Use this method to reverse the linked list
     */
    public void reverse() {
        if (head == null) {
            throw new IllegalArgumentException("List is already empty, cannot remove anything");
        }
        Node previous = head;
        Node current = head.next;
        Node next = null;
        Node last = previous;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        last.next = null;
    }

    /**
     * use to method to convert Linked List to Array
     *
     * @return : an int Array
     */
    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
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
