package com.dvoretskyi.entity;

public class Subject {

  private String name;
  private boolean isMandatory;

  public Subject() {
  }

  public Subject(String name, boolean isMandatory) {
    this.name = name;
    this.isMandatory = isMandatory;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isMandatory() {
    return isMandatory;
  }

  public void setMandatory(boolean mandatory) {
    isMandatory = mandatory;
  }

  @Override
  public String toString() {
    return "Subject{" +
        "name='" + name + '\'' +
        ", isMandatory=" + isMandatory +
        '}';
  }
}
