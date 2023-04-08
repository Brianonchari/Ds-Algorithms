package com.brianonchari.datastructures.java_utils.comparators;

public class Items {
  private String name;
  private int position;

  public Items(String name, int position) {
    this.name = name;
    this.position = position;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  @Override
  public String toString() {
    //        return "Items{" +
    //                "name='" + name + '\'' +
    //                '}';
    return name;
  }
}
