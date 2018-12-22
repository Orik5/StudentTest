package com.dvoretskyi.service;

import com.dvoretskyi.entity.Subject;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {
  public List<Subject> showSubjects(){
    List<Subject> subjectList = new ArrayList();
    subjectList.add(new Subject("Mathematics", true));
    subjectList.add(new Subject("Physics", true));
    subjectList.add(new Subject("Astronomy", true));
    subjectList.add(new Subject("History", true));
    subjectList.add(new Subject("Ethics", false));
    subjectList.forEach(System.out::println);
    return subjectList;
  }
}
