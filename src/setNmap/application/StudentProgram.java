package setNmap.application;

import setNmap.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        addStudents(sc, set, "A");
        addStudents(sc, set, "B");
        addStudents(sc, set, "C");

        System.out.println("Total students: " + set.size());

        sc.close();
    }

    private static void addStudents(Scanner sc, Set<Student> set, String course) {
        System.out.print("How many students for course " + course + ": ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter ID for student " + (i + 1) + ": ");
            int id = sc.nextInt();

            set.add(new Student(id));
        }
    }

}
