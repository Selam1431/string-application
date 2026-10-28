package com.pluralsight;
import java.util.Scanner;
import java.util.ArrayList;





import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students  = new ArrayList<>();

        students.add(new Student("sara", 20, 90));
        students.add(new Student("Alex", 22, 85));

        System.out.println(" Student Managment");

        System.out.println(" 1. View Students: ");
        System.out.println("2.Add Student: ");
        System.out.println("3. Exit: ");

        System.out.println("Enter your choice: ");

        int choice = scanner.nextInt();

        result(choice, students, scanner);

        scanner.close();






    }
    public static void result(int choice, ArrayList<Student> students, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println(" Vieing students...");

                for(Student student:students) {
                    System.out.println(
                            "Name" + student.getName() +
                            ", Age " + student.getAge() +
                            ", Grade" + student.getGrade()
                    );
                }
                break;



            case 2:
                System.out.println("Adding students ");
                scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print(" Enter age: ");

                int age = scanner.nextInt();

                System.out.print("Enter your grade: ");

                double grade= scanner.nextDouble();

                Student newStudent = new Student(name, age, grade);

                students.add(newStudent);

                System.out.print("Student added successfully");


                break;

            case 3:
                System.out.println(" GoodBye!");

            default:
                System.out.println("Invalid choice.");

        }
    }
}

