/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask04.entity;

import java.sql.Time;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Oct 2022
 */
public class Film {

    private String tittle;
    private String director;
    private Integer hour;

    public Film() {
    }

    public Film(String tittle, String director, Integer hour) {
        this.tittle = tittle;
        this.director = director;
        this.hour = hour;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDirector() {
        return director;
    }

    public Integer getHour() {
        return hour;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Título: " + tittle + ".\nDirector: " + director + ".\nDuración: " + hour + "\n";
    }

}
