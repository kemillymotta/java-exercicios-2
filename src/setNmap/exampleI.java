package setNmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class exampleI {

    /*
    metodos importantes
    add(obj), remove(obj), contains(obj)
    clear(), size(), removeIf()
    addAll(other) - união adiciona no conjunto os elementos
    do outro conjunto
    retainAll(other) - interseção: remove do conjunto os elementos
    não contidos em other
    removeAll(other) - diferença: remove do conjunto os elementos
    contidos em other
     */

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        // System.out.println(set.contains("Notebook"));
        // set.remove("Tablet");
        // set.removeIf(x -> x.length() >= 3);
        // set. removeIf(x -> x.charAt(0) == 'T');

        for(String p : set) {
            System.out.println(p);
        }

    }
}
