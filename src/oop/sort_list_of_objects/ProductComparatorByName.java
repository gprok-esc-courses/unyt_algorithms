package oop.sort_list_of_objects;

import java.util.Comparator;

public class ProductComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
