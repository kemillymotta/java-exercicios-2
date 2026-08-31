package lambda;

import lambda.ProductLam;

import java.util.*;

public class exampleI {

    public static void main(String[] args) {

        List<ProductLam> list = new ArrayList<>();

        list.add(new ProductLam("TV", 900.0));
        list.add(new ProductLam("Notebook", 1200.0));
        list.add(new ProductLam("Tablet", 450.0));

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(ProductLam p : list) {
            System.out.println(p);
        }
    }

}
