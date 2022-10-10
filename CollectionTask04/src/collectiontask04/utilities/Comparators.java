/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask04.utilities;

import collectiontask04.entity.Film;
import java.util.Comparator;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Oct 2022
 */
public class Comparators {

    public static Comparator<Film> longFilmsDesc = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f2.getHour().compareTo(f1.getHour());
        }
    };

    public static Comparator<Film> longFilmsAsc = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.getHour().compareTo(f2.getHour());
        }
    };

    public static Comparator<Film> tittleAlphabetic = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.getTittle().compareTo(f2.getTittle());
        }
    };

    public static Comparator<Film> directorAlphabetic = new Comparator<Film>() {
        @Override
        public int compare(Film f1, Film f2) {
            return f1.getDirector().compareTo(f2.getDirector());
        }
    };

}
