package com.brianonchari.datastructures.problems;

import java.util.HashSet;

public class RemoveDuplicatesLinkedList {
    public Node head;

    public static void main(String[] args){
        RemoveDuplicatesLinkedList list = new RemoveDuplicatesLinkedList();
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        System.out.print("Original List: ");
        list.display();

        list.deleteDups();

        System.out.print("Updated List: ");
        list.display();
    }

    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public Node() {
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteDups(){
        if(head==null){
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node previous = null;
        while(current != null){
            int data = current.data;

            if (set.contains(data)) {
                previous.next = current.next;
            } else {
                set.add(data);
                previous = current;
            }

            current = current.next;
        }
    }

    public  void display(){
        Node current = head;
        while (current!= null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
