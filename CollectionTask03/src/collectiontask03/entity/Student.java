/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask03.entity;

import java.util.ArrayList;

/**
 *
 * @author Exequiel Hordt
 * @version 30 Sep 2022
 */
public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student() {
    }

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

}
