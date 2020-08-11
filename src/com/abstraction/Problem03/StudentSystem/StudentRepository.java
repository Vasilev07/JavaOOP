package com.abstraction.Problem03.StudentSystem;

import java.util.HashMap;

public class StudentRepository {
    private HashMap<String, Student> studentRepository = new HashMap<String, Student>();

    public void addStudent(String name, Student student) {
        this.studentRepository.put(name, student);
    }

    public Student findStudentByName(String name) {
        return this.studentRepository.get(name);
    }
}
