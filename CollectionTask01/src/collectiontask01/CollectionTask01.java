/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask01;

import collectiontask01.entity.DogBreed;
import collectiontask01.service.DogBreed_Service;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 28 Sep 2022
 */
public class CollectionTask01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        DogBreed_Service dogService = new DogBreed_Service();
        //Procedures
        dogService.addDogs();
        dogService.showList();
        System.out.println("");
        System.out.println("Eliminar Raza");
        System.out.println("*************");
        dogService.searchDog();
    }

}
