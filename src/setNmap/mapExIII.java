package setNmap;

import setNmap.entities.ProductI;

import java.util.HashMap;
import java.util.Map;

public class mapExIII {

    public static void main(String[] args) {

        Map<ProductI,Double> cookies = new HashMap<>();

        ProductI p1 = new ProductI("Tv", 900.0);
        ProductI p2 = new ProductI("Notebook", 1200.0);
        ProductI p3 = new ProductI("Tablet", 400.0);

        cookies.put(p1, 10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 15000.0);

        ProductI ps = new ProductI("Tv", 900.0);

        System.out.println("Contains 'ps' key: "+ cookies.containsKey(ps));
    }
}
