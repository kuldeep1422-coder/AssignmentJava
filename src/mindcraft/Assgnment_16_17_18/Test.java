package mindcraft.Assgnment_16_17_18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        // Create Student objects

        Student student1 = new Student(
                101,
                "Kuldeep",
                85.5,
                new HashSet<>(
                        Arrays.asList("Java", "SQL", "Spring")
                )
        );

        Student student2 = new Student(
                102,
                "Rahul",
                72.5,
                new HashSet<>(
                        Arrays.asList("Java", "HTML")
                )
        );

        Student student3 = new Student(
                103,
                "Amit",
                91.5,
                new HashSet<>(
                        Arrays.asList("Python", "SQL")
                )
        );

        Student student4 = new Student(
                104,
                "Sneha",
                65.5,
                new HashSet<>(
                        Arrays.asList("Java", "Flutter")
                )
        );


        // Create List

        List<Student> students = Arrays.asList(
                student1,
                student2,
                student3,
                student4
        );


        // ------------------------------------------------
        // Question 16
        // Print complete Student List
        // ------------------------------------------------

        System.out.println("========== STUDENT LIST ==========");

        for (Student student : students) {

            System.out.println(student);
        }


        // ------------------------------------------------
        // Question 16(c)
        // UtilityReport
        // ------------------------------------------------

        UtilityReport utilityReport =
                new UtilityReport();

        utilityReport.showReport(students);


        // ------------------------------------------------
        // Question 17
        // Comparator
        // ------------------------------------------------

        System.out.println(
                "\n========== USING COMPARATOR =========="
        );

        PercentageComparator percentageComparator =
                new PercentageComparator();

        students.sort(percentageComparator);

        for (Student student : students) {

            System.out.println(
                    student.getName()
                            + " --> "
                            + student.getPercentage()
            );
        }


        // ------------------------------------------------
        // Question 18
        // Comparable
        // ------------------------------------------------

        System.out.println(
                "\n========== USING COMPARABLE =========="
        );

        Collections.sort(students);

        for (Student student : students) {

            System.out.println(
                    student.getName()
                            + " --> "
                            + student.getPercentage()
            );
        }
    }
}