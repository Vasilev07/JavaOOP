package com.abstraction.Problem03.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.matches("Exit")) {
                break;
            } else if (input.matches("Create\\s\\w+\\s\\d+\\s\\d+.?\\d+")) {
                String[] command = input.split(" ");

                String name = command[1];
                int age = Integer.parseInt(command[2]);
                double grade = Double.parseDouble(command[3]);

                Student student = new Student(name, age, grade);

                studentRepository.addStudent(name, student);
            } else if (input.matches("Show\\s\\w+")) {
                String[] command = input.split(" ");
                String name = command[1];
                Student student = studentRepository.findStudentByName(name);
                StudentEvaluation studentEvaluation = new StudentEvaluation(student);
            }
        }
    }
}
