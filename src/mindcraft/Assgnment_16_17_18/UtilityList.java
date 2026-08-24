package mindcraft.Assgnment_16_17_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilityList {

    private List<Student> list;

    // Constructor
    public UtilityList() {
        list = new ArrayList<>();
    }

    // Create student list
    public void createList() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("\nEnter details of Student "
                    + (i + 1));

            System.out.print("Enter Roll Number: ");
            int rollno = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Percentage: ");
            double percentage = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("Enter skills separated by space: ");
            String skills = scanner.nextLine();

            String[] skillArray = skills.split(" ");

            java.util.Set<String> skillset =
                    new java.util.HashSet<>();

            for (String skill : skillArray) {
                skillset.add(skill);
            }

            Student student = new Student(
                    rollno,
                    name,
                    percentage,
                    skillset
            );

            list.add(student);
        }
    }

    // Print complete student list
    public void printList() {

        System.out.println("\n----- Student List -----");

        for (Student student : list) {

            System.out.println(student);
        }
    }

    // Getter for list
    public List<Student> getList() {

        return list;
    }
}