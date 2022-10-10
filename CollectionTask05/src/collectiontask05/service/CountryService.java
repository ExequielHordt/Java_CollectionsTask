/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask05.service;

import collectiontask05.entity.Country;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Exequiel Hordt
 * @version 04 Oct 2022
 */
public class CountryService {

    //Global variables
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private TreeSet<Country> countrySet = new TreeSet<>();
    private Country country;

    /**
     * This method consist in return the list of the countries in order. It is
     * used a TreeSet for order the list and not-repeat countries.
     *
     * @return countryList Its purpose is to set up a set of countries in
     * alphabetic order.
     */
    public void addCountry() {
        String name;
        char option = ' ';
        System.out.println("Lista de Paises");
        System.out.println("***************");
        do {
            country = new Country();
            System.out.print("Pais: ");
            country.setName(read.next());
            countrySet.add(country);
            System.out.print("¿Desea agregar otro pais?: ");
            option = Character.toLowerCase(read.next().charAt(0));
        } while (option != 'n');

    }

    /**
     * This method consist in show the countries. It is used a for each for
     * browse the set.
     */
    public void showCountrySet() {
        System.out.println("Mostrar paises");
        System.out.println("**************");
        for (Country country : countrySet) {
            System.out.println(country);
        }
    }

    /**
     * This method consist in remove the country by the name that is enter by
     * the user. It is used an Iterator for remove the country.
     */
    public void removeCountry() {
        //Variables
        Iterator<Country> it = countrySet.iterator();
        String option;
        int i;
        boolean found;
        found = false;
        //Procedures
        System.out.println("Eliminar pais");
        System.out.println("*************");
        System.out.print("Ingrese pais: ");
        option = read.next();
        while (it.hasNext()) {
            Country countryAux = it.next();
            if (countryAux.getName().equalsIgnoreCase(option)) {
                it.remove();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("El pais ingresado no se encuentra en la lista");
        }
    }

}
