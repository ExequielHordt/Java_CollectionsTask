/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask05;

import collectiontask05.entity.Country;
import collectiontask05.service.CountryService;
import java.util.TreeSet;

/**
 *
 * @author Exequiel Hordt
 * @version 04 Oct 2022
 */
public class CollectionTask05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Global variables
        CountryService countryService = new CountryService();
        countryService.addCountry();
        System.out.println("");
        countryService.showCountrySet();
        countryService.removeCountry();
        countryService.showCountrySet();
    }

}
