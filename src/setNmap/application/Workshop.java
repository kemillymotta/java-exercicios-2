package setNmap.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Workshop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> javaStudents = new HashSet<>();
        Set<Integer> databaseStudents = new HashSet<>();

        addStudents(sc, javaStudents, "Java workshop");
        addStudents(sc, databaseStudents, "Database workshop");

        // unique students
        Set<Integer> allStudents = new HashSet<>(javaStudents);
        allStudents.addAll(databaseStudents);
        System.out.println("Total unique students: " + allStudents.size());

        // students in both workshops
        Set<Integer> bothWorkshops = new HashSet<>(javaStudents);
        bothWorkshops.retainAll(databaseStudents);
        System.out.println("Students in both workshops: " + bothWorkshops.size());

        // java only
        Set<Integer> onlyJava = new HashSet<>(javaStudents);
        onlyJava.removeAll(databaseStudents);
        System.out.println("Only Java: " + onlyJava.size());

        // database only
        Set<Integer> onlyDatabase = new HashSet<>(databaseStudents);
        onlyDatabase.removeAll(javaStudents);
        System.out.println("Only Database: " + onlyDatabase.size());

        // students in one workshop
        Set<Integer> oneWorkshop = new HashSet<>(onlyJava);
        oneWorkshop.addAll(onlyDatabase);
        System.out.println("Students in exactly one workshop: " + oneWorkshop.size());

        sc.close();
    }

    public static void addStudents(Scanner sc, Set<Integer> set, String workshop) {
        System.out.print("How many students for " + workshop + ": ");
        int quantity = sc.nextInt();

        for(int i = 1; i <= quantity; i++) {
            System.out.print("Enter ID for student " + i + ": ");
            int id = sc.nextInt();

            set.add(id);
        }
    }
}
