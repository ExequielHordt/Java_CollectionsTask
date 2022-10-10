/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask04;

import collectiontask04.entity.Film;
import collectiontask04.service.FilmService;
import java.util.ArrayList;

/**
 *
 * @author Exequiel Hordt
 * @version 03 Oct 2022
 */
public class CollectionTask04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        FilmService filmService = new FilmService();
        ArrayList<Film> filmList = filmService.createFilm();
        filmService.showAllFilms();
        filmService.showLongFilms();
        filmService.showLongFilmsDesc();
        filmService.showLongFilmsAsc();
        filmService.showAlphabeticTittle();
        filmService.showAlphabeticDirector();
    }

}
