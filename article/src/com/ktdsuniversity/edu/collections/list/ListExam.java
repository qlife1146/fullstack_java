package com.ktdsuniversity.edu.collections.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.restaurant.Menu;

public class ListExam {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("jjj");
    names.add("jjj2");
    names.add("jjj3");
    names.add("jjj4");
    names.add("jjj5");

    // System.out.println(names);
    String name = null;
    for (int i = 0; i < names.size(); i++) {
      name = names.get(i);
      System.out.println(name);
    }

    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    // old
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    // new
    for (int i : arr) {
      System.out.println(i);
    }

    for (int i : arr) {
      System.out.println(i);
    }

    List<Menu> products = new ArrayList<>();
  }
}
