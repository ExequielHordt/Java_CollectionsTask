/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask03.service;

import collectiontask03.entity.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 30 Sep 2022
 */
public class StudentService {

    //Global privates variables
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Student> studentList = new ArrayList<>();
    private Student student;

    /**
     * This method consist in create a student.
     *
     * @return ArrayList<Student> This list contains the list of the students
     */
    public ArrayList<Student> createStudent() {
        //Variables
        char option;
        option = ' ';
        //Procedures
        System.out.println("Lista de alumnos");
        System.out.println("****************");
        do {
            ArrayList<Integer> gradesList = new ArrayList<>();
            student = new Student();
            System.out.print("Ingrese el nombre del alumno/a: ");
            student.setName(read.next());
            System.out.print("Ingrese la primer nota: ");
            gradesList.add(read.nextInt());
            System.out.print("Ingrese la segunda nota: ");
            gradesList.add(read.nextInt());
            System.out.print("Ingrese la tercer nota: ");
            gradesList.add(read.nextInt());
            System.out.println("");
            student.setGrades(gradesList);
            studentList.add(student);
            System.out.print("¿Desea ingresar otro alumno/a? (S/N): ");
            option = read.next().toLowerCase().charAt(0);
            System.out.println("");
        } while (option != 'n');
        return studentList;
    }

    /**
     * This method consist in return the final grade of the student
     *
     * @param gradesList This parameter is a list of the student's grades
     * @return average This variable contain the final grade of the student
     */
    public double finalGrade(ArrayList<Integer> gradesList) {
        //Variables
        int i;
        double average, plus;
        plus = 0;
        //Procedures
        for (i = 0; i < gradesList.size(); i++) {
            plus += gradesList.get(i);
        }
        average = plus / gradesList.size();
        return average;
    }
}
