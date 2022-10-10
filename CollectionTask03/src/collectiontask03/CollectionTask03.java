/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask03;

import collectiontask03.entity.Student;
import collectiontask03.service.StudentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 30 Sep 2022
 */
public class CollectionTask03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        StudentService studentService = new StudentService();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String name;
        int i;
        double average;
        boolean found;
        average = 0.0;
        found = false;
        //Procedures
        ArrayList<Student> studentList = studentService.createStudent();
        Iterator<Student> it = studentList.iterator();
        System.out.println("Nota Final");
        System.out.println("**********");
        System.out.print("Ingrese el nombre del alumno: ");
        name = read.next();
        while (it.hasNext()) {
            Student studentAux = it.next();
            if (studentAux.getName().equalsIgnoreCase(name)) {
                System.out.println("La nota final del alumno/a " + name + " es " + studentService.finalGrade(studentAux.getGrades()));
                found = true;
            }
        }
        if (found == false) {
            System.out.println("El/La alumno/a " + name + " no fue encontrado/a en lista de alumnos");
        }

    }

}
