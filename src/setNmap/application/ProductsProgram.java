package setNmap.application;

import setNmap.entities.Products;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductsProgram {

    public static void main(String[] args) {

        Set<Products> set = new TreeSet<>();

        set.add(new Products("TV", 900.0));
        set.add(new Products("Notebook", 1200.0));
        set.add(new Products("Table", 400.0));

//        Products prod = new Products("Notebook", 1200.0);
//
//        System.out.println(set.contains(prod));

        for(Products p : set) {
            System.out.println(p);
        }

    }
}
