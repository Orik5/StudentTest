package com.dvoretskyi.service;

import com.dvoretskyi.entity.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
  public List<Student> showStudents(){
    List<Student> studentList = new ArrayList();
    studentList.add(new Student("Valery", "Popov"));
    studentList.add(new Student("Semyon", "Korzhev"));
    studentList.add(new Student("Peter", "Ivanov"));
    studentList.add(new Student("Maria", "Semenova"));
    studentList.add(new Student("Kolya", "Nesterenko"));
    studentList.forEach(System.out::println);
    return studentList;
  }
}
