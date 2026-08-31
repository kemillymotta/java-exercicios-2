package lambda.samInterfaces;

import generics.entities.Product;
import lambda.util.PriceUpdate;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {


        /* represents an operation that acceps a single input argument and
        * returns no result. consumer is expected to operate via side-effects
        * method is accept(Object)*/

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));

        // list.forEach(new PriceUpdate()); - implementacao da interface
        // list.forEach(Product::staticPriceUpdate); - reference method com metodo estatico
        // list.forEach(Product::nonStaticPriceUpdate); - reference method com metodo nao estatico

        /* Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * 1.1);}; - expressao lambda declarada*/

        list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); // expressao lambda inline

        list.forEach(System.out::println);


    }
}
