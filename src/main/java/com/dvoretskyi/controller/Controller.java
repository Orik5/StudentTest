package com.dvoretskyi.controller;

import com.dvoretskyi.service.MarkService;
import com.dvoretskyi.service.StudentService;
import com.dvoretskyi.service.SubjectService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

  public void showMenu() throws IOException {
    StudentService studentService = new StudentService();
    SubjectService subjectService = new SubjectService();
    MarkService markService = new MarkService();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int i;

    System.out.println("Please ,enter what you want to do :");
    System.out
        .println("1==show students group;  2==show subjects;  3==show marks;  4==fill marks");

    for (i = 0; i < 4; i++) {
      String enter = reader.readLine();
      int number = Integer.parseInt(enter);
      if (enter.equals("1")) {
        studentService.showStudents();
      }
      if (enter.equals("2")) {
        subjectService.showSubjects();
      }
      if (enter.equals("3")) {
        markService.showMarks();
      }
      if (enter.equals("4")) {
        markService.fillMarks();
      }
    }


  }


}

