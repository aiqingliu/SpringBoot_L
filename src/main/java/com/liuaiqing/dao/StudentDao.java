package com.liuaiqing.dao;

import com.liuaiqing.model.Student;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class StudentDao {

    private static Map<String, Student> StudentMap = null;

    static {
        StudentMap = new HashMap<String, Student>();

        StudentMap.put("101",new Student("101", "ltt", "6800001", "A1"));
        StudentMap.put("102",new Student("102", "lsf", "6800002", "A2"));
        StudentMap.put("103",new Student("103", "lyq", "6800003", "A2"));
        StudentMap.put("104",new Student("104", "laq", "6800004", "A1"));
        StudentMap.put("105",new Student("105", "lbb", "6800005", "A4"));
    }

    public Collection<Student> findStudents() {
        return StudentMap.values();
    }
}
