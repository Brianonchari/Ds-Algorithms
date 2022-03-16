package com.brianonchari.datastructures.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {
  private SinglyLinkedList singlyLinkedList;

  @Before
  public void setup() {
    singlyLinkedList = new SinglyLinkedList();
  }

  @Test
  public void testEmptyList() {
    // Linked list should be empty initially.
    // Its length should be 0
    assertTrue(singlyLinkedList.isEmpty());
    assertEquals(0, singlyLinkedList.length());
  }

  @Test
  public void testAppendToList() {
    // Append data(node) to the linked list
    // Check to ensure that its not empty
    // because of one data that has been appended
    singlyLinkedList.append("ABC");
    assertFalse(singlyLinkedList.isEmpty());
  }
}
