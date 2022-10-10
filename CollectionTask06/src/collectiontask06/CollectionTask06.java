/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask06;

import collectiontask06.service.ProductService;

/**
 *
 * @author Exequiel Hordt
 * @version 05 Oct 2022
 */
public class CollectionTask06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        ProductService productService = new ProductService();
        char option;
        //Procedures
        productService.shopMenu();
    }

}
