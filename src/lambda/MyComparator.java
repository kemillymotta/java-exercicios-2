package lambda;

import java.util.Comparator;
import lambda.ProductLam;

public class MyComparator implements Comparator<ProductLam> {


    @Override
    public int compare(ProductLam p1, ProductLam p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
