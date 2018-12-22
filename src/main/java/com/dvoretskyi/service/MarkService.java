package com.dvoretskyi.service;

import com.dvoretskyi.entity.Mark;
import com.dvoretskyi.entity.Student;
import com.dvoretskyi.entity.Subject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MarkService {

  public void showMarks() {
    Stream<Mark> markStream = Stream

        .of(new Mark(new Student("Valery", "Popov"), new Subject("History", true), 1),
            new Mark(new Student("Valery", "Popov"), new Subject("Mathematics", true), 1),
            new Mark(new Student("Valery", "Popov"), new Subject("Physics", true), 2),
            new Mark(new Student("Valery", "Popov"), new Subject("Astronomy", true), 0),
            new Mark(new Student("Valery", "Popov"), new Subject("Ethics", false), 3));

    List<Mark> marks = markStream
        .collect(Collectors.toList());

    marks.forEach(System.out::println);

    Mark mark = new Mark();
  }

  public void fillMarks() throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int i;
    boolean boolVar;
    String line;
    //String write;
    System.out.println();

 /*   Subject subject = new Subject();
    subject.setName("");*/

    SubjectService subjectService = new SubjectService();

    System.out.println("enter first name");
    String name = reader.readLine();
    System.out.println("enter last name");
    String surname = reader.readLine();
// for(i=0;i<subjectService.showSubjects().size();i++){
    ////////////////////////////////////
    System.out.println("enter subject");
    String write = reader.readLine();
//////////////////////////////////////////////

    ///
    System.out.println("Write mandatory status");
    line = reader.readLine();
    boolVar = Boolean.parseBoolean(line);
/*
    boolean isMandatory=reader.ready();*/
    ///
    System.out.println("Please ,enter mark :");

    String enter = reader.readLine();
    int number = Integer.parseInt(enter);

    ////////////////////////////////////
    System.out.println("enter subject");
    String write2 = reader.readLine();
//////////////////////////////////////////////

    System.out.println("Write mandatory status");
    line = reader.readLine();
    boolean boolVar2 = Boolean.parseBoolean(line);

    System.out.println("Please ,enter mark :");
    String enter2 = reader.readLine();
    int number2 = Integer.parseInt(enter2);

    ////////////////////////////////////
    System.out.println("enter subject");
    String write3 = reader.readLine();
//////////////////////////////////////////////

    System.out.println("Write mandatory status");
    line = reader.readLine();
    boolean boolVar3 = Boolean.parseBoolean(line);

    System.out.println("Please ,enter mark :");
    String enter3 = reader.readLine();
    int number3 = Integer.parseInt(enter3);

    ////////////////////////////////////
    System.out.println("enter subject");
    String write4 = reader.readLine();
//////////////////////////////////////////////

    System.out.println("Write mandatory status");
    line = reader.readLine();
    boolean boolVar4 = Boolean.parseBoolean(line);

    System.out.println("Please ,enter mark :");
    String enter4 = reader.readLine();
    int number4 = Integer.parseInt(enter4);

    ////////////////////////////////////
    System.out.println("enter subject");
    String write5 = reader.readLine();
//////////////////////////////////////////////

    System.out.println("Write mandatory status");
    line = reader.readLine();
    boolean boolVar5 = Boolean.parseBoolean(line);

    System.out.println("Please ,enter mark :");
    String enter5 = reader.readLine();
    int number5 = Integer.parseInt(enter5);

    Stream<Mark> markStream = Stream

        .of(new Mark(new Student(name, surname), new Subject(write, boolVar), number),
            new Mark(new Student(name, surname), new Subject(write2, boolVar2), number2),
            new Mark(new Student(name, surname), new Subject(write3, boolVar3), number3),
            new Mark(new Student(name, surname), new Subject(write4, boolVar4), number4),
            new Mark(new Student(name, surname), new Subject(write5, boolVar5), number5));

    List<Mark> marks = markStream
        .collect(Collectors.toList());

    marks.forEach(System.out::println);

  }


}

