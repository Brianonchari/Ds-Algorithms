package com.brianonchari.datastructures.linkedlist;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static LinkedList remove(LinkedList list, int data) {
        Node currentNode = list.head;
        Node prevNode = null;

        if (currentNode != null && currentNode.data == data) {
            list.head = currentNode.next; // Change the head to the next node
            return list;
        }

        // Search for the data to be removed, keep track of the previous node
        while (currentNode != null && currentNode.data != data) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        // If data was not found in the list
        if (currentNode == null) {
            return list;
        }
        // Unlink the node from the linked list
        prevNode.next = currentNode.next;
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList :");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);

        printList(list);

        list = remove(list,2);
        printList(list);
    }
}
