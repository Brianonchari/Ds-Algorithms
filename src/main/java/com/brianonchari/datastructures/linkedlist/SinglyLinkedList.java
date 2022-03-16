package com.brianonchari.datastructures.linkedlist;

/**
 * Linkedlists are used to store objects of same type just like an array A linked list is a linear
 * data structure where elements are not stored in a contiguous locations Each element is linked to
 * the other using pointers and addresses
 *
 * <p>Internally a linked list works like a dynamic array
 *
 * <p>Single linked list can only be traversed in one direction
 */
public class SinglyLinkedList {
  private Node head;

  public boolean isEmpty() {
    return length() == 0;
  }

  // Append data at the tail of the Single linked list
  public void append(String data) {
    if (head == null) {
      head = new Node(data);
    }
    tail().next = new Node(data);
  }

  // Get the length of the list
  public int length() {
    int length = 0;
    Node current = head; // Start counting length of linked list from head
    while (current != null) {
      length++;
      current = current.next;
    }
    return length;
  }

  private Node tail() {
    Node tail = head;
    while (tail.next != null) {
      tail = tail.next;
    }
    return tail;
  }

  private static class Node {
    private Node next;
    private String data;

    public Node(String data) {
      this.data = data;
    }

    @Override
    public String toString() {
      return this.data;
    }
  }
}
