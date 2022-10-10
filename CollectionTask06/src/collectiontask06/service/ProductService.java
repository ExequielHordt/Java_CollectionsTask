/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask06.service;

import collectiontask06.entity.Product;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Exequiel Hordt
 * @version 05 Oct 2022
 */
public class ProductService {

//Global variables
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private Product product;
    private HashMap<String, Double> productMap = new HashMap<>();

    /**
     * This method consist in chosing a multiple option to do action like add,
     * remove, update and show products enters by user. This method using a
     * switch case and call each methods to do an specific action.
     */
    public void shopMenu() {
        char option;
        option = ' ';
        do {
            System.out.println("Menu");
            System.out.println("****");
            System.out.print("Presione un número para realizar una accion\n1)Agregar producto\n2)Actualizar producto\n3)Eliminar producto\n4)Mostrar productos\n5)Salir\nOpcion seleccionada: ");
            option = read.next().charAt(0);
            switch (option) {
                case '1':
                    addProduct();
                    break;
                case '2':
                    updateProduct();
                    break;
                case '3':
                    removeProduct();
                    break;
                case '4':
                    showProduct();
                    break;
                case '5':
                    System.out.print("Presione la tecla S para salir. Caso contrario, presione cualquier otra tecla para permanecer en el Menu: ");
                    option = Character.toLowerCase(read.next().charAt(0));
                    break;
                default:
                    System.out.println("La opcion seleccionada no existe. Por favor, vuelva a intentarlo");
                    System.out.println("");
                    break;
            }
        } while (option != 's');
        System.out.println("");
        System.out.println("Fin del programa");
        System.out.println("");
    }

    /**
     * This method consist in add product into the HashMap class called
     * productMap.
     */
    public void addProduct() {
        //Variable
        product = new Product();
        //Procedures
        System.out.println("Agregar producto");
        System.out.println("****************");
        System.out.print("Producto: ");
        product.setName(read.next());
        System.out.print("Precio: ");
        product.setPrice(read.nextDouble());
        System.out.println("");
        productMap.put(product.getName(), product.getPrice());
    }

    /**
     * This method consist in update products compare to the name of product
     * enter by user and browse by HashMap element called productMap thanks to
     * For Each and the action of compare it is used by conditional if, when the
     * name enter by user is equal to the name of product in the productMap.
     */
    public void updateProduct() {
        //Variable
        String searchProduct;
        //Procedures
        System.out.println("Actualizar producto");
        System.out.println("*******************");
        System.out.print("Producto: ");
        searchProduct = read.next();
        for (Map.Entry<String, Double> productMapAux : productMap.entrySet()) {
            String key = productMapAux.getKey();
            Double value = productMapAux.getValue();
            if (key.equalsIgnoreCase(searchProduct)) {
                System.out.print("Ingrese el nuevo precio: ");
                product.setPrice(read.nextDouble());
                productMap.put(key, product.getPrice());
            }

        }
    }

    /**
     * This method consist in remove product using Iterator object called "it"
     * by the name of product enter by user. The action of compare is by "if
     * conditional" when the name of product enter by user is equal to the name
     * of product in the productMap.
     */
    public void removeProduct() {
        //Variables
        Iterator<String> it = productMap.keySet().iterator();
        String searchProduct;
        boolean found;
        found = false;
        //Procedures
        System.out.println("Eliminar producto");
        System.out.println("*****************");
        System.out.print("Producto: ");
        searchProduct = read.next();
        while (it.hasNext()) {
            String key = it.next();
            if (key.equalsIgnoreCase(searchProduct)) {
                it.remove();
                found = true;
            }

        }
        if (found == false) {
            System.out.println("El producto ingresado no existe");
        }
    }

    /**
     * This method consist in show products using For Each method. Thanks to
     * keys (Characteristic of maps), the method compare product key for search
     * and after that, show each product.
     */
    public void showProduct() {
        //Procedures
        System.out.println("Mostrar conjunto de productos");
        System.out.println("*****************************");
        for (Map.Entry<String, Double> productMapAux : productMap.entrySet()) {
            String key = productMapAux.getKey();
            Double value = productMapAux.getValue();
            System.out.println("Producto: " + key + " Precio: " + value);

        }
    }

}
