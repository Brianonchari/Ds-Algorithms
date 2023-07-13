package com.brianonchari.datastructures.linkedlist.singlylinkedlist;

import com.brianonchari.datastructures.problems.RemoveDuplicatesLinkedList;

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

    public Node createCircularLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return  head;
    }

    // Inserts  new node at the end of linked list
    public Node insert(int data, int location){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else if(location==0){
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node current = head;
            int index = 0;
            while (index<location-1){
                current = current.next;
                index++;
            }
            current.next = newNode;
//            while (current.next != null){
//                current = current.next;
//            }
//            current.next = newNode;
//            tail = newNode;
        }
        size++;
        return newNode;
    }

    public  void display(){
        Node current = head;
        while (current!= null){
            System.out.print(current.value + "->");

            current = current.next;
        }
        System.out.println("null");
        System.out.println("Linked list size ->" + size);
    }

    public Node middleOfLinkedList(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node : "+ slow.value);
        return slow;

    }

    public int findNthToLast(int n) {
        if (head == null || n <= 0) {
            return -1; // Invalid input or list is empty
        }

        Node slow = head;
        Node fast = head;

        // Move the fast pointer ahead by n positions
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1; // n is greater than the length of the list
            }
            fast = fast.next;
        }

        // Move both slow and fast pointers until fast reaches the end of the list
        int count = 0;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;

        }

        System.out.println("Nth to last : "+ slow.value);
        System.out.println("Number of Nth to last elements: "+ count);

        return slow.value;
    }

    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast==slow){
                return  true;
            }
        }
        return false;

    }
}
