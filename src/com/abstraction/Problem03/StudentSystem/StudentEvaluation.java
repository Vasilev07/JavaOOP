package com.abstraction.Problem03.StudentSystem;

import java.text.MessageFormat;

public class StudentEvaluation {

    public StudentEvaluation(Student student) {
        System.out.println(this.makeEvaluation(student));
    }

    private String makeEvaluation(Student student) {
        String name = student.getName();
        int age = student.getAge();
        double grade = student.getGrade();

        if (grade >= 5) {
            return MessageFormat.format("{0} is {1} years old. Excellent student.", name, age);
        } else if (grade > 4 && grade < 5) {
            return MessageFormat.format("{0} is {1} years old. Average student.", name, age);
        } else {
            return MessageFormat.format("{0} is {1} years old. Poor student.", name, age);
        }
    }
}
