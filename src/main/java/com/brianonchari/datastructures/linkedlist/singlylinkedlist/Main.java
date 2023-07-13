package com.brianonchari.datastructures.linkedlist.singlylinkedlist;

public class Main {

   public static void main(String[] args){
       SinglyLinkedList list = new SinglyLinkedList();

       list.createSinglyLinkedList(1);
       System.out.println(list.head.value);

       list.insert(4,1);
       list.insert(4,3);
       list.insert(0,0);
       list.display();
//       list.insert(5);
//       list.insert(6);
//       list.insert(7);
//       list.insert(8);
//       list.findNthToLast(1);
//       System.out.println("Head Value :" +list.head.value);
//       System.out.println("Tail value :" +list.tail.value);
//       list.display();
//
//       list.middleOfLinkedList(list.head);
//       System.out.println("Has CYcle  : " + list.hasCycle(list.head));
   }

}
