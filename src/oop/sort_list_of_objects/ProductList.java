package oop.sort_list_of_objects;

import java.util.ArrayList;

public class ProductList {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("keyboard", 45.2));
        products.add(new Product("mouse", 12.5));
        products.add(new Product("monitor", 190.7));
        products.add(new Product("speakers", 80.3));
        products.add(new Product("camera", 17.3));

        // SORT the list by price
        products.sort(new ProductComparatorByPrice());

        for(Product product : products) {
            System.out.println(product);
        }

        System.out.println("BY NAME");
        products.sort(new ProductComparatorByName());
        for(Product product : products) {
            System.out.println(product);
        }
    }
}
