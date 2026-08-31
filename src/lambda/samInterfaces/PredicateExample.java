package lambda.samInterfaces;

import generics.entities.Product;
import lambda.util.ProductPredicate;

import java.util.*;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        /* represents a predicate boolean-valued funcion of one argument
        * method is test(Object) */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));

        //
        //list.removeIf(new ProductPredicate()); - implementação da interface
        // list.removeIf(Product::staticProductPredicate); - reference method com metodo estatico
        // list.removeIf(Product::nonStaticProductPredicate); - reference method com metodo nao estatico

        /* Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);  - expressao lambda declarada */

        list.removeIf(p -> p.getPrice() >= 100.0); // expressao lambda inline

        for (Product p : list) {
            System.out.println(p);
        }

    }

}
