package com.ktdsuniversity.edu.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class school {
  public static void printStudents(Map<Integer, List<Student>> classes, int classNum) {
    List<Student> students = classes.get(classNum);

    if (students != null) {
      for (Student student : students) {
        System.out.println(classNum + "반의 학생: " + student);
      }
    }
  }

  public static void main(String[] args) {
    Map<Integer, List<Student>> classes = new HashMap<>();
    classes.put(1, new ArrayList<>());
    classes.put(2, new ArrayList<>());
    List<Student> students = classes.get(1);
    students.add(new Student(1, "aa"));
    students.add(new Student(2, "bb"));
    students.add(new Student(3, "cc"));
    students.add(new Student(4, "dd"));
    printStudents(classes, 0);
    printStudents(classes, 1);
    printStudents(classes, 2);
  }
}
