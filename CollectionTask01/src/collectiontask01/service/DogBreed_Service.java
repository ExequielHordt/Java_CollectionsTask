/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask01.service;

import collectiontask01.entity.DogBreed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 29 Sep 2022
 */
public class DogBreed_Service {

    //Global Variables
    private ArrayList<DogBreed> dogList = new ArrayList();
    private DogBreed dog = new DogBreed();
    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    /**
     * This method consist in create a dog
     *
     * @return DogBreed Is a object with the whole atributes about the dogs
     * enters by the users
     */
    public DogBreed CreateDogs() {
        DogBreed dog = new DogBreed();
        System.out.print("Ingrese nombre: ");
        dog.setName(read.next());
        System.out.print("Ingrese edad: ");
        dog.setAge(read.nextInt());
        System.out.print("Ingrese apodo: ");
        dog.setNickname(read.next());
        System.out.print("Ingrese raza: ");
        dog.setBreed(read.next());
        return dog;
    }

    /**
     * This method consist in add a Dog in a list
     */
    public void addDogs() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        char option;
        option = ' ';
        //Procedures
        System.out.println("Lista de perros");
        System.out.println("***************");
        do {
            System.out.println("");
            dogList.add(CreateDogs());
            System.out.print("¿Desea agregar otro perro (S/N): ");
            option = Character.toLowerCase(read.next().charAt(0));
        } while (option != 'n');
        System.out.println("");
    }

    /**
     * This method consist in remove a dog if the name and breed dog is equal to
     * the same data enter by user
     */
    public void searchDog() {
        //Variables
        Iterator<DogBreed> it = dogList.iterator();
        boolean found;
        String name;
        String breed;
        found = false;
        //Procedures
        System.out.print("Ingrese nombre: ");
        name = read.next();
        System.out.print("Ingrese raza: ");
        breed = read.next();
        while (it.hasNext()) {
            // Variable
            DogBreed dogAux = it.next();
            //Procedures
            if (dogAux.getBreed().equalsIgnoreCase(breed) && dogAux.getName().equalsIgnoreCase(name)) {
                it.remove();
                found = true;
                System.out.println("Raza eliminada");
                System.out.println("");
                showList();
            }
        }
        if (found == false) {
            System.out.println("Raza no encontrada");
            System.out.println("");
            showList();
        }
    }

    /**
     * This method consist in show the dog list
     */
    public void showList() {
        dogList.forEach((dogBreed) -> {
            System.out.println(dogBreed);
        });
    }

}
