package com.liuaiqing.model;

/**
 * student 学生
 */
public class Student {

    private String studentcode;
    private String name;
    private String phone;
    private String classname;

    public Student() {
    }

    public Student(String studentcode, String name, String phone, String classname) {
        this.studentcode = studentcode;
        this.name = name;
        this.phone = phone;
        this.classname = classname;
    }

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
