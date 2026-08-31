package lambda.samInterfaces;

import generics.entities.Product;
import lambda.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FunctionExample {

    public static void main(String[] args) {

        /* represents a function that accepts one argument and produces a result
        * methos is apply(Object)*/

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));

        /*funcao map é uma funcao que aplica uma funcao a todos os elementos
        de uma stream*/

        // list pra stream -> .stream()
        // stream pra list -> .collect(Collectors.toList())

        /* List<String> names = list.stream().map(new UpperCaseName())
                .collect(Collectors.toList()); - implementacao da interface */

        /* List<String> names = list.stream().map(Product::staticUpperCaseName)
                .collect(Collectors.toList()); - reference method com metodo estatico */

        /* List<String> names = list.stream().map(Product::nonStaticUpperCaseName)
                .collect(Collectors.toList()); - reference method com metodo nao estatico */

        /*
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names = list.stream().map(func)
                .collect(Collectors.toList()); - expressao lambda declarada */

        List<String> names = list.stream().map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList()); // - expressao lambda inline

        names.forEach(System.out::println);



    }
}
