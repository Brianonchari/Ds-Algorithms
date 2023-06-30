package com.brianonchari.datastructures.linkedlist.singlylinkedlist;

public class Main {

   public static void main(String[] args){
       SinglyLinkedList list = new SinglyLinkedList();
       list.head = list.createSinglyLinkedList(1);
       Node next = list.createSinglyLinkedList(2);
       System.out.println(list.tail.value);
   }

}
