package setNmap;

import java.util.HashMap;

public class mapExI {
    public static void main(String[] args) {

        //map = collection of key value pairs

        // < > its the type of the keys and values we have on the map
        // and they cant be primative types
        HashMap<String, Integer> empIds = new HashMap<>();

        //add data
        //doesnt guarantee a certain order
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl")); //get data

        System.out.println(empIds.containsKey("Jerry")); // o(1)
        System.out.println(empIds.containsKey("George"));

        System.out.println(empIds.containsValue(6)); // see if the value exists in the map, o(n)
        System.out.println(empIds.containsValue(12345));

        empIds.put("John", 98765);
        System.out.println(empIds);
        empIds.replace("Kramer", 777); // doesnt do anything if it doesnt exists
        System.out.println(empIds);

        empIds.putIfAbsent("John", 222); // put it if its not currently in the map
        System.out.println(empIds);
        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);

    }
}
