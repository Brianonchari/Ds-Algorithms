package com.brianonchari.datastructures.linkedlist.singlylinkedlist;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // The time complexity for creating  a node is O(1)
    // The space complexity is also O(1), because we are only creating a space of one node in memory

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }
}
