package com.brianonchari.datastructures.java_utils.comparators;

import java.util.ArrayList;
import java.util.List;

// public class Main {
//    public static void main(String[] args) {
//        List<Items> items = new ArrayList<>();
//        items.add(new Items("apple",1));
//        items.add(new Items("apple",2));
//        items.add(new Items("banana",3));
//        items.add(new Items("banana",4));
//        items.add(new Items("banana",5));
//
//        List<Items> sortedItems = new ArrayList<>();
//        for (int i = 0; i < items.size(); i++) {
//            Items item = items.get(i);
//            if (sortedItems.isEmpty() || !sortedItems.get(sortedItems.size() -
// 1).getName().equals(item.getName())) {
//                sortedItems.add(item);
//            } else {
//                int j = sortedItems.size() - 2;
//                while (j >= 0 && sortedItems.get(j).getName().equals(item.getName())) {
//                    j--;
//                }
//                sortedItems.add(j + 1, item);
//            }
//        }
//
//        System.out.println(sortedItems);
//    }
// }
public class Main {

  public static void main(String[] args) {
    List<Items> items = new ArrayList<>();
    items.add(new Items("banana", 0));
    items.add(new Items("apple", 1));
    items.add(new Items("apple", 2));
    items.add(new Items("banana", 3));
    items.add(new Items("banana", 4));

    items.forEach(System.out::println);

    //        Collections.sort(items,new ItemsComparator());
    items.sort(new ItemsComparator(items));
    System.out.println(items);
  }
}
