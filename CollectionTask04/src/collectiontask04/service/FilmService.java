/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask04.service;

import collectiontask04.entity.Film;
import collectiontask04.utilities.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Oct 2022
 */
public class FilmService {

    //Global Variables
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Film> filmList;
    private Film film;

    public ArrayList<Film> createFilm() {
        //Variables
        filmList = new ArrayList<>();
        char option;
        option = ' ';
        //Procedures
        System.out.println("Peliculas");
        System.out.println("*********");
        do {
            film = new Film();
            System.out.print("Nombre de la película: ");
            film.setTittle(read.next());
            System.out.print("Director: ");
            film.setDirector(read.next());
            System.out.print("Duración: ");
            film.setHour(read.nextInt());
            filmList.add(film);
            System.out.println("");
            System.out.print("¿Desea agregar otra película? (S/N): ");
            option = Character.toLowerCase(read.next().charAt(0));
            System.out.println("");
        } while (option != 'n');
        return filmList;
    }

    /**
     * This method consist in show the whole list of the films
     */
    public void showAllFilms() {
        System.out.println("Mostrar todas las películas");
        System.out.println("***************************");
        for (Film films : filmList) {
            System.out.println(films);
        }

    }

    /**
     * This method consist in show the films there is long than 1 hour
     */
    public void showLongFilms() {
        //Variable
        int i;
        //Procedures
        System.out.println("Mostrar solo las películas de más de 1 hora de duración");
        System.out.println("*******************************************************");
        for (i = 0; i < filmList.size(); i++) {
            if (filmList.get(i).getHour() > 1) {
                System.out.println(filmList.get(i));
            }
        }

    }

    /**
     * This method consist in show the list of films in descendent order
     */
    public void showLongFilmsDesc() {
        System.out.println("Mostrar solo las películas de más de 1 hora de duración [Ordenadas de Mayor a Menor]");
        System.out.println("************************************************************************************");
        Collections.sort(filmList, Comparators.longFilmsDesc);
        for (Film film : filmList) {
            System.out.println(film);
        }
    }

    /**
     * This method consist in show the list of films in ascendent order
     */
    public void showLongFilmsAsc() {
        System.out.println("Mostrar solo las películas de más de 1 hora de duración [Ordenadas de Mayor a Menor]");
        System.out.println("************************************************************************************");
        Collections.sort(filmList, Comparators.longFilmsAsc);
        for (Film film : filmList) {
            System.out.println(film);
        }
    }

    public void showAlphabeticTittle() {
        System.out.println("Mostrar los titulos de las peliculas ordenadas alfabeticamente");
        System.out.println("**************************************************************");
        Collections.sort(filmList, Comparators.tittleAlphabetic);
        for (Film film : filmList) {
            System.out.println(film.getTittle() + "\n");
        }
    }

    public void showAlphabeticDirector() {
        System.out.println("Mostrar los directores de las peliculas ordenadas alfabeticamente");
        System.out.println("*****************************************************************");
        Collections.sort(filmList, Comparators.directorAlphabetic);
        for (Film film : filmList) {
            System.out.println(film.getDirector() + "\n");
        }
    }

}
